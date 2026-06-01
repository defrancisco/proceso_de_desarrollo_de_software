package clase_5.patrones_MVC_Adapter_y_Strategy.clases;

import clase_5.patrones_MVC_Adapter_y_Strategy.interfaces.*;


// Estrategia concreta para WhatsApp
public class NotificacionWhatsApp implements EstrategiaNotificacion {
    private IWhatsAppAdapter adapter;

    public NotificacionWhatsApp(IWhatsAppAdapter adapter) {
        this.adapter = adapter;
    }

    @Override
    public void enviar(Mensaje mensaje, Cliente cliente) {
        adapter.enviarWhatsApp(cliente.getTelefono(), mensaje.getMensaje());
    }
}

