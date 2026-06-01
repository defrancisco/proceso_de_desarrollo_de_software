package clase_5.patrones_MVC_Adapter_y_Strategy.clases;

import clase_5.patrones_MVC_Adapter_y_Strategy.interfaces.*;

public class NotificacionEmail implements EstrategiaNotificacion {
    private IEmailAdapter adapter;

    public NotificacionEmail(IEmailAdapter adapter){
        this.adapter = adapter;
    }

    @Override
    public void enviar(Mensaje mensaje,Cliente cliente) {
        adapter.enviarEmail(cliente.getEmail(), mensaje.getMensaje());
    }
}


