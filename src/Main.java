import sushi.RumbaSushiBuilder;
import sushi.Sushi;
import sushi.SushiBuilder;
import sushi.TakiSushiBuilder;

import java.util.ArrayList;

public class Main {

    private static ArrayList<Sushi> sushis = new ArrayList<>();

    private static void imprimir() {
        for (Sushi sushi : sushis) {
            System.out.println(sushi);
        }
    }

    public static void main(String[] args) {

        SushiBuilder takiBuilder = new TakiSushiBuilder()
            .nombre()
            .pescado()
            .huevas()
            .wasabi()
            .camaron()
            .pepino()
            .aguacate()
            .pinia();

        SushiBuilder rumbaBuilder = new RumbaSushiBuilder()
            .nombre()
            .pescado()
            .huevas()
            .wasabi()
            .camaron()
            .pepino()
            .aguacate()
            .pinia();

        sushis.add(takiBuilder.build());
        sushis.add(rumbaBuilder.build());

        imprimir();
    }
}
