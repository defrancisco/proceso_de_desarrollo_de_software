package clase_5.EjercicioEnClase.adapters.moduloNotificaciones;

public class Notificacion {
    private String emailDestinatario;
    private String emailRemitente;
    private String mensaje;
    private String nroCompletoDestinatario;
    private String nroCompletoRemitente;



    // Setters y Getters
    public String getEmailDestinatario() { return emailDestinatario; }
    public String setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
        return emailDestinatario;
    }

    public String getEmailRemitente() { return emailRemitente; }
    public String setEmailRemitente(String emailRemitente) { this.emailRemitente = emailRemitente;
        return emailRemitente;
    }

    public String getMensaje() { return mensaje; }
    public void setMensaje(String mensaje) { this.mensaje = mensaje; }

    public String getNroCompletoDestinatario() { return nroCompletoDestinatario; }
    public void setNroCompletoDestinatario(String nroCompletoDestinatario) {  this.nroCompletoDestinatario = nroCompletoDestinatario; }

    public String getNroCompletoRemitente() { return nroCompletoRemitente; }
    public void setNroCompletoRemitente(String nroCompletoRemitente) { this.nroCompletoRemitente = nroCompletoRemitente; }




}
