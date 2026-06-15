package clase;

public class Texto extends Moderable {
    private String contenidoTexto;

    public Texto(String contenidoTexto) {
        this.contenidoTexto = contenidoTexto;
    }

    public String getContenidoTexto() {
        return contenidoTexto;
    }
}