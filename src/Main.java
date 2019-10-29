import sushi.Sushi;
import sushi.SushiBuilder;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Sushi> sushis = new ArrayList<>();

    private static void imprimir() {
        for (Sushi sushi : sushis) {
            System.out.println(sushi);
        }
    }

    public static void main(String[] args) {

        SushiBuilder takiBuilder = new SushiBuilder()
            .nombre("taki taki")
            .pescado("salmon")
            .huevas("gamba")
            .wasabi(true)
            .camaron("agua fria")
            .pepino(true)
            .aguacate("pinkerton")
            .pinia(false);

        SushiBuilder rumbaBuilder = new SushiBuilder()
            .nombre("rumba")
            .pescado("atun")
            .huevas("caviar")
            .wasabi(false)
            .camaron("rio")
            .pepino(true)
            .aguacate("bacon")
            .pinia(true);

        sushis.add(takiBuilder.build());
        sushis.add(rumbaBuilder.build());

        imprimir();
    }
}
