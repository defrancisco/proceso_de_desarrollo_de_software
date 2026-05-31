package clase_5;


import clase_5.clases.*;
import clase_5.clases.Cliente;
import clase_5.clases.JavaMailAdapter;
import clase_5.clases.Mensaje;
import clase_5.clases.ModuloNotificaciones;
import clase_5.clases.NotificacionEmail;
import clase_5.clases.NotificacionSMS;
import clase_5.clases.NotificacionWhatsApp;
import clase_5.clases.TwilioSMSAdapter;
import clase_5.clases.TwilioWhatsAppAdapter;
import clase_5.interfaces.*;
import clase_5.interfaces.EstrategiaNotificacion;
import clase_5.interfaces.IEmailAdapter;
import clase_5.interfaces.ISMSAdapter;
import clase_5.interfaces.IWhatsAppAdapter;


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
