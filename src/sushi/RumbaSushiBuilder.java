package sushi;

public class RumbaSushiBuilder extends SushiBuilder {

    public RumbaSushiBuilder() {
    }

    public Sushi build() {
        return new Sushi(this);
    }

    public SushiBuilder nombre() {
        this.nombre = "rumba";
        return this;
    }

    public SushiBuilder pescado() {
        this.pescado = "atun";
        return this;
    }

    public SushiBuilder huevas() {
        this.huevas = "caviar";
        return this;
    }

    public SushiBuilder wasabi() {
        this.wasabi = false;
        return this;
    }

    public SushiBuilder camaron() {
        this.camaron = "rio";
        return this;
    }

    public SushiBuilder pepino() {
        this.pepino = true;
        return this;
    }

    public SushiBuilder aguacate() {
        this.aguacate = "bacon";
        return this;
    }

    public SushiBuilder pinia() {
        this.pinia = true;
        return this;
    }

}
