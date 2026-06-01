package clase_5.patrones_MVC_Adapter_y_Strategy.clases;

import clase_5.patrones_MVC_Adapter_y_Strategy.interfaces.*;

public class Cliente {
    private String nombre;
    private String apellido;
    private String telefono;
    private String email;

    // Referenciamos a la configuración de por medio (nuestra stategy)
    private EstrategiaNotificacion medioPreferidoNotificacion;

    public Cliente(String nombre, String apellido, String telefono, String email, EstrategiaNotificacion medioPreferidoNotificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.email = email;
        this.medioPreferidoNotificacion = medioPreferidoNotificacion;


    }

    public String getTelefono() { return telefono;}
    public String getEmail() { return email;}
    public EstrategiaNotificacion getMedioPreferido() { return medioPreferidoNotificacion;}
}