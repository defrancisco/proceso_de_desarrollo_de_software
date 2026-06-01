package clase_5.patrones_MVC_Adapter_y_Strategy.clases;

import clase_5.patrones_MVC_Adapter_y_Strategy.interfaces.*;

public class NotificacionSMS implements EstrategiaNotificacion {
    private ISMSAdapter adapter;

    public NotificacionSMS(ISMSAdapter adapter){
        this.adapter = adapter;
    }

    @Override
    public void enviar(Mensaje mensaje, Cliente cliente) {
        adapter.enviarSMS(cliente.getTelefono(), mensaje.getMensaje());
    }
}

