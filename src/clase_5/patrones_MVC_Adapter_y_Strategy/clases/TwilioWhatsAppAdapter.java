package clase_5.patrones_MVC_Adapter_y_Strategy.clases;

import clase_5.patrones_MVC_Adapter_y_Strategy.interfaces.*;

// Clases de Adapters Concretos (Simulamos la conexión a las APIs externas)
public class TwilioWhatsAppAdapter implements IWhatsAppAdapter {
    @Override
    public void enviarWhatsApp(String numero, String mensaje) {
        // Acá iría el código real de la API de Twilio
        System.out.println("[Twilio API] Enviando WhatsApp al " + numero + ": " + mensaje);
    }
}