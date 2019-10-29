package sushi;

public class SushiBuilder {

    private String nombre;
    private String pescado;
    private String huevas;
    private boolean wasabi;
    private String camaron;
    private boolean pepino;
    private String aguacate;
    private boolean pinia;

    public SushiBuilder() {
    }

    public Sushi build() {
        return new Sushi(this);
    }

    public SushiBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
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

    public String getNombre() {
        return nombre;
    }

    public String getPescado() {
        return pescado;
    }

    public String getHuevas() {
        return huevas;
    }

    public boolean getWasabi() {
        return wasabi;
    }

    public String getCamaron() {
        return camaron;
    }

    public boolean getPepino() {
        return pepino;
    }

    public String getAguacate() {
        return aguacate;
    }

    public boolean getPinia() {
        return pinia;
    }
}
