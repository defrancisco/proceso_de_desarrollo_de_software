package clase_5.clases;

import clase_5.interfaces.EstrategiaNotificacion;
import clase_5.interfaces.ISMSAdapter;

public class NotificacionSMS implements EstrategiaNotificacion {
    private ISMSAdapter adapter;

    public NotificacionSMS(ISMSAdapter adapter){
        this.adapter = adapter;
    }

    @Override
    public void enviar(clase_5.clases.Mensaje mensaje, clase_5.clases.Cliente cliente) {
        adapter.enviarSMS(cliente.getTelefono(), mensaje.getMensaje());
    }
}

