package clase_5.clases;

import clase_5.interfaces.EstrategiaNotificacion;
import clase_5.interfaces.IEmailAdapter;

public class NotificacionEmail implements EstrategiaNotificacion {
    private IEmailAdapter adapter;

    public NotificacionEmail(IEmailAdapter adapter){
        this.adapter = adapter;
    }

    @Override
    public void enviar(clase_5.clases.Mensaje mensaje, clase_5.clases.Cliente cliente) {
        adapter.enviarEmail(cliente.getEmail(), mensaje.getMensaje());
    }
}


