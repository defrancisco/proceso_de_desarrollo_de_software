package clase_5.Modulo_de_Envio_de_Notificaciones;

public class  Notificacion {
    private String emailDestinatario;
    private String emailRemitente;
    private String mensaje;
    private String nroTelefonoDestinatario;
    private String nroTelefonoRemitente;


    public String getEmailDestinatario() {
        return emailDestinatario;
    }
    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }


    public String getEmailRemitente() {
        return emailRemitente;
    }
    public void setEmailRemitente(String emailRemitente) {
        this.emailRemitente = emailRemitente;
    }


    public String getMensaje() {
        return mensaje;
    }
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getNroTelefonoDestinatario() {
        return nroTelefonoDestinatario;
    }
    public void setNroTelefonoDestinatario(String nroTelefonoDestinatario) {
        this.nroTelefonoDestinatario = nroTelefonoDestinatario;
    }

    public String getNroTelefonoRemitente() {
        return nroTelefonoRemitente;
    }
    public void setNroTelefonoRemitente(String nroTelefonoRemitente) {
        this.nroTelefonoRemitente = nroTelefonoRemitente;
    }
}
