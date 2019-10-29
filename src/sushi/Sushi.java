package sushi;

public class Sushi {

    private String nombre;
    private String pescado;
    private String huevas;
    private boolean wasabi;
    private String camaron;
    private boolean pepino;
    private String aguacate;
    private boolean pinia;

    public Sushi(SushiBuilder builder) {
        nombre = builder.getNombre();
        pescado = builder.getPescado();
        huevas = builder.getHuevas();
        wasabi = builder.getWasabi();
        camaron = builder.getCamaron();
        pepino = builder.getPepino();
        aguacate = builder.getAguacate();
        pinia = builder.getPinia();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPescado() {
        return pescado;
    }

    public void setPescado(String pescado) {
        this.pescado = pescado;
    }

    public String getHuevas() {
        return huevas;
    }

    public void setHuevas(String huevas) {
        this.huevas = huevas;
    }

    public boolean getWasabi() {
        return wasabi;
    }

    public void setWasabi(boolean wasabi) {
        this.wasabi = wasabi;
    }

    public String getCamaron() {
        return camaron;
    }

    public void setCamaron(String camaron) {
        this.camaron = camaron;
    }

    public boolean getPepino() {
        return pepino;
    }

    public void setPepino(boolean pepino) {
        this.pepino = pepino;
    }

    public String getAguacate() {
        return aguacate;
    }

    public void setAguacate(String aguacate) {
        this.aguacate = aguacate;
    }

    public boolean getPinia() {
        return pinia;
    }

    public void setPinia(boolean pinia) {
        this.pinia = pinia;
    }

    @Override
    public String toString() {
        return "Sushi{" +
                "nombre='" + nombre + '\'' +
                ", pescado='" + pescado + '\'' +
                ", huevas='" + huevas + '\'' +
                ", wasabi=" + wasabi +
                ", camaron='" + camaron + '\'' +
                ", pepino=" + pepino +
                ", aguacate='" + aguacate + '\'' +
                ", pinia=" + pinia +
                '}';
    }
}
