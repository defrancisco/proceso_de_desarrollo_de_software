package clase_5.patrones_MVC_Adapter_y_Strategy.clases;

import clase_5.patrones_MVC_Adapter_y_Strategy.interfaces.*;

public class Mensaje {
    private String contenidoMensaje; // puede ser texto plano o HTML

    public Mensaje(String contenidoMensaje) {
        this.contenidoMensaje = contenidoMensaje;
    }

    public String getMensaje() {
        return contenidoMensaje;
    }
}


