package clase_5.clases;

public class Mensaje {
    private String contenidoMensaje; // puede ser texto plano o HTML

    public Mensaje(String contenidoMensaje) {
        this.contenidoMensaje = contenidoMensaje;
    }

    public String getMensaje() {
        return contenidoMensaje;
    }
}


