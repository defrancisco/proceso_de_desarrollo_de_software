package clase_5.patrones_MVC_Adapter_y_Strategy.clases;

import clase_5.patrones_MVC_Adapter_y_Strategy.interfaces.*;

public class TwilioSMSAdapter implements ISMSAdapter {
    @Override
    public void enviarSMS(String numero, String mensaje) {
        // Acá iría el código real de la API de Twilio
        System.out.println("[Twilio API] Enviando SMS al " + numero + ": " + mensaje);
    }
}