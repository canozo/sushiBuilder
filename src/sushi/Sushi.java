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
