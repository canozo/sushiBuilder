package sushi;

public class SushiDirector {

    public SushiDirector() {
    }

    public void hacerSushi(SushiBuilder builder) {
        // hace un builder para rollos california por default
        builder
            .aguacate("normal")
            .huevas("caviar")
            .pepino(true)
            .pescado("crab stick");
    }
}
