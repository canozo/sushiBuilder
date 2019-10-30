package sushi;

public class TakiSushiBuilder extends SushiBuilder {

    public TakiSushiBuilder() {
    }

    public Sushi build() {
        return new Sushi(this);
    }

    public SushiBuilder nombre() {
        this.nombre = "taki taki";
        return this;
    }

    public SushiBuilder pescado() {
        this.pescado = "salmon";
        return this;
    }

    public SushiBuilder huevas() {
        this.huevas = "gamba";
        return this;
    }

    public SushiBuilder wasabi() {
        this.wasabi = true;
        return this;
    }

    public SushiBuilder camaron() {
        this.camaron = "agua fria";
        return this;
    }

    public SushiBuilder pepino() {
        this.pepino = true;
        return this;
    }

    public SushiBuilder aguacate() {
        this.aguacate = "pinkerton";
        return this;
    }

    public SushiBuilder pinia() {
        this.pinia = false;
        return this;
    }
}
