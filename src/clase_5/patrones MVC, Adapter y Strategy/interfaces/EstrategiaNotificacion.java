package clase_5.interfaces;

import clase_5.clases.Cliente;
import clase_5.clases.Mensaje;

// Mi interfaz de patrón Strategy
public interface EstrategiaNotificacion {
    void enviar(Mensaje mensaje, Cliente cliente);
}
