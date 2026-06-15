package clase_5.EjercicioEnClase.adapters;

import clase_5.EjercicioEnClase.adapters.Adaptor.email.AdapterEmail;
import clase_5.EjercicioEnClase.adapters.Adaptor.sms.AdapterSMS;
import clase_5.EjercicioEnClase.adapters.Adaptor.whatsapp.AdapterWSP;
import clase_5.EjercicioEnClase.adapters.moduloNotificaciones.*;

import java.util.ArrayList;
import java.util.List;

import static clase_5.EjercicioEnClase.adapters.Estrategia.*;


public class MainExample {

	public static void main(String[] args) {
		Notificador notificador = new Notificador();
		EstrategiaDeNotificacion notificadorSMS = new NotificacionPorSMS(new AdapterSMS());
		EstrategiaDeNotificacion notificadorWhatsApp = new NotificacionPorWSP(new AdapterWSP());
		EstrategiaDeNotificacion notificadorEmail = new NotificacionPorEmail(new AdapterEmail());

		for(UsuarioNotificacionMock usuarioMock : usuariosMock()) {
			Notificacion notificacion = new Notificacion();
			notificacion.setEmailDestinatario(usuarioMock.getEmailDestinatario());
			notificacion.setEmailRemitente(usuarioMock.getEmailRemitente());
			notificacion.setMensaje(usuarioMock.getMensaje());
			notificacion.setNroCompletoDestinatario(usuarioMock.getNroCompletoDestinatario());
			notificacion.setNroCompletoRemitente(usuarioMock.getEmailRemitente());
			
			switch(usuarioMock.getEstrategiaElegida()) {
				case SMS: notificador.setEstrategia(notificadorSMS); break;
				case WHATSAPP: notificador.setEstrategia(notificadorWhatsApp); break;
				case EMAIL: notificador.setEstrategia(notificadorEmail); break;	
			}
			
			notificador.enviar(notificacion);
		}		
	}
	
	private static List<UsuarioNotificacionMock> usuariosMock(){
		List<UsuarioNotificacionMock> usuariosMock = 
				new ArrayList<UsuarioNotificacionMock>();
		
		UsuarioNotificacionMock usuarioMock = 
				new UsuarioNotificacionMock("prueba1@test.com", 
						"remitente1@test.com", 
						"Tu paquete esta en camino", 
						"+541154874514", 
						"+51454745754", 
						EMAIL);
		usuariosMock.add(usuarioMock);
		
		usuarioMock = 
				new UsuarioNotificacionMock("prueba2@test.com", 
						"remitente2@test.com", 
						"Tu pedido ha sido rechazado", 
						"+54645646546", 
						"+8985252",
						WHATSAPP);
		usuariosMock.add(usuarioMock);
		
		usuarioMock = 
				new UsuarioNotificacionMock("prueba3@test.com",
						"remitente3@test.com",
						"El vendedor esta preparando el pedido",
						"+541154874514",
						"+51454745754",
						SMS);
		usuariosMock.add(usuarioMock);
		
		return usuariosMock;
	}

}
