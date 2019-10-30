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

    public abstract SushiBuilder pescado(String pescado);
    public abstract SushiBuilder huevas(String huevas);
    public abstract SushiBuilder wasabi(boolean wasabi);
    public abstract SushiBuilder camaron(String camaron);
    public abstract SushiBuilder pepino(boolean pepino);
    public abstract SushiBuilder aguacate(String aguacate);
    public abstract SushiBuilder pinia(boolean pinia);

    public Sushi build() {
        return new Sushi(this);
    }

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
