package clase_5.clases;

import clase_5.interfaces.IEmailAdapter;

public class JavaMailAdapter implements IEmailAdapter {
    @Override
    public void enviarEmail(String direccion, String mensaje) {
        // Acá iría el uso de cualquier biblioteca de Email elegida
        System.out.println("[JavaMail API] Enviando Email a " + direccion + ": " + mensaje);
    }
}
