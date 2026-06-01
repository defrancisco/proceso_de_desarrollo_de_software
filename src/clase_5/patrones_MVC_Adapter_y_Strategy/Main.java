package clase_5.patrones_MVC_Adapter_y_Strategy;


import clase_5.patrones_MVC_Adapter_y_Strategy.clases.*;
import clase_5.patrones_MVC_Adapter_y_Strategy.interfaces.EstrategiaNotificacion;
import clase_5.patrones_MVC_Adapter_y_Strategy.interfaces.IEmailAdapter;
import clase_5.patrones_MVC_Adapter_y_Strategy.interfaces.ISMSAdapter;
import clase_5.patrones_MVC_Adapter_y_Strategy.interfaces.IWhatsAppAdapter;


public class Main {
    public static void main(String[] args) {
        // 1. Instanciamos los Adapters
        IWhatsAppAdapter waAdapter = new TwilioWhatsAppAdapter();
        ISMSAdapter smsAdapter = new TwilioSMSAdapter();
        IEmailAdapter emailAdapter = new JavaMailAdapter();

        // 2. Instanciamos las Estrategias inyectando sus respectivos Adapters
        EstrategiaNotificacion estrategiaWA = new NotificacionWhatsApp(waAdapter);
        EstrategiaNotificacion estrategiaSMS = new NotificacionSMS(smsAdapter);
        EstrategiaNotificacion estrategiaEmail = new NotificacionEmail(emailAdapter);

        // 3. Creamos clientes con diferentes preferencias de notificación
        Cliente cliente1 = new Cliente("Ana", "Perez", "1122334455", "ana@mail.com", estrategiaWA);
        Cliente cliente2 = new Cliente("Juan", "Cruz", "5544332211", "juan@mail.com", estrategiaSMS);
        Cliente cliente3 = new Cliente("Maria", "Gomez", "9988776655", "maria@mail.com", estrategiaEmail);

        // 4. Creamos el sistema y el mensaje
        ModuloNotificaciones modulo = new ModuloNotificaciones();
        Mensaje promo = new Mensaje("<h1>¡Aprovecha nuestro descuento del 20%!</h1>"); // Código HTML

        // 5. Ejecutamos los envíos
        System.out.println("--- Iniciando envíos ---");
        modulo.notificar(cliente1, promo); // Saldrá por WhatsApp (Twilio)
        modulo.notificar(cliente2, promo); // Saldrá por SMS (Twilio)
        modulo.notificar(cliente3, promo); // Saldrá por Email (JavaMail)
    }
}
