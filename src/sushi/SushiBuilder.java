package sushi;

public abstract class SushiBuilder {

    String nombre;
    String pescado;
    String huevas;
    boolean wasabi;
    String camaron;
    boolean pepino;
    String aguacate;
    boolean pinia;

    public abstract Sushi build();
    public abstract SushiBuilder nombre();
    public abstract SushiBuilder pescado();
    public abstract SushiBuilder huevas();
    public abstract SushiBuilder wasabi();
    public abstract SushiBuilder camaron();
    public abstract SushiBuilder pepino();
    public abstract SushiBuilder aguacate();
    public abstract SushiBuilder pinia();

    String getNombre() {
        return nombre;
    }

    String getPescado() {
        return pescado;
    }

    String getHuevas() {
        return huevas;
    }

    boolean getWasabi() {
        return wasabi;
    }

    String getCamaron() {
        return camaron;
    }

    boolean getPepino() {
        return pepino;
    }

    String getAguacate() {
        return aguacate;
    }

    boolean getPinia() {
        return pinia;
    }
}
