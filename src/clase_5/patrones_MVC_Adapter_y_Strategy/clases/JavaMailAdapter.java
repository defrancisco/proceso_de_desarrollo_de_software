package clase_5.patrones_MVC_Adapter_y_Strategy.clases;

import clase_5.patrones_MVC_Adapter_y_Strategy.interfaces.*;

public class JavaMailAdapter implements IEmailAdapter {
    @Override
    public void enviarEmail(String direccion, String mensaje) {
        // Acá iría el uso de cualquier biblioteca de Email elegida
        System.out.println("[JavaMail API] Enviando Email a " + direccion + ": " + mensaje);
    }
}
