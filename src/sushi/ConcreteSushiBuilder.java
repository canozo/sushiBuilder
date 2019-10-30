package sushi;

public class ConcreteSushiBuilder extends SushiBuilder {

    public ConcreteSushiBuilder(String nombre) {
        this.nombre = nombre;
    }

    public SushiBuilder pescado(String pescado) {
        this.pescado = pescado;
        return this;
    }

    public SushiBuilder huevas(String huevas) {
        this.huevas = huevas;
        return this;
    }

    public SushiBuilder wasabi(boolean wasabi) {
        this.wasabi = wasabi;
        return this;
    }

    public SushiBuilder camaron(String camaron) {
        this.camaron = camaron;
        return this;
    }

    public SushiBuilder pepino(boolean pepino) {
        this.pepino = pepino;
        return this;
    }

    public SushiBuilder aguacate(String aguacate) {
        this.aguacate = aguacate;
        return this;
    }

    public SushiBuilder pinia(boolean pinia) {
        this.pinia = pinia;
        return this;
    }

}
