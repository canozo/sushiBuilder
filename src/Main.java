import sushi.ConcreteSushiBuilder;
import sushi.Sushi;
import sushi.SushiBuilder;
import sushi.SushiDirector;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {

    private static ArrayList<SushiBuilder> builders = new ArrayList<>();

    public static void main(String[] args) {

        // crear builders por medio del director
        SushiBuilder california = new ConcreteSushiBuilder("California");
        SushiDirector director = new SushiDirector();
        director.hacerSushi(california);

        // crear builders custom
        SushiBuilder takiTaki = new ConcreteSushiBuilder("Taki Taki")
            .pescado("Salmon")
            .huevas("Samba")
            .wasabi(true)
            .camaron("Agua Fria")
            .pepino(false)
            .aguacate("Pinkerton")
            .pinia(false);

        SushiBuilder rumba = new ConcreteSushiBuilder("Rumba")
            .pescado("Atun")
            .huevas("Caviar")
            .wasabi(false)
            .camaron("Rio")
            .pepino(true)
            .aguacate("Bacon")
            .pinia(true);

        SushiBuilder rumbaSinAguacate = new ConcreteSushiBuilder("Rumba Reloaded")
            .pescado("Atun")
            .huevas("Caviar")
            .wasabi(false)
            .camaron("Rio")
            .pepino(true)
            .aguacate("Bacon")
            .pinia(false);

        builders.add(takiTaki);
        builders.add(rumba);
        builders.add(rumbaSinAguacate);
        builders.add(california);

        // iniciar el factory
        int creados = 0;
        Random rand = new Random();
        while (creados < 15) {
            SushiBuilder builder = builders.get(rand.nextInt(builders.size()));
            Sushi sushi = builder.build();
            System.out.println(sushi);
            creados += 1;
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
