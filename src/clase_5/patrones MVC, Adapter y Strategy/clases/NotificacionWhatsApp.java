package clase_5.clases;

import clase_5.interfaces.EstrategiaNotificacion;
import clase_5.interfaces.IWhatsAppAdapter;


// Estrategia concreta para WhatsApp
public class NotificacionWhatsApp implements EstrategiaNotificacion {
    private IWhatsAppAdapter adapter;

    public NotificacionWhatsApp(IWhatsAppAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void enviar(clase_5.clases.Mensaje mensaje, clase_5.clases.Cliente cliente) {
        adapter.enviarWhatsApp(cliente.getTelefono(), mensaje.getMensaje());
    }
}

