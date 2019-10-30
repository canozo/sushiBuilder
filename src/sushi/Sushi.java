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
        final StringBuffer sb = new StringBuffer("Sushi{");
        sb.append("nombre='").append(nombre).append('\'');
        if (pescado != null)
            sb.append(", pescado='").append(pescado).append('\'');
        if (huevas != null)
            sb.append(", huevas='").append(huevas).append('\'');
        if (wasabi)
            sb.append(", wasabi=").append(wasabi);
        if (camaron != null)
            sb.append(", camaron='").append(camaron).append('\'');
        if (pepino)
            sb.append(", pepino=").append(pepino);
        if (aguacate != null)
            sb.append(", aguacate='").append(aguacate).append('\'');
        if (pinia)
            sb.append(", pinia=").append(pinia);
        sb.append('}');
        return sb.toString();
    }
}
