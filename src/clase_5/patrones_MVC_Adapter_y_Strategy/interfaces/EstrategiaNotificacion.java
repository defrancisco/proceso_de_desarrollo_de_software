package clase_5.patrones_MVC_Adapter_y_Strategy.interfaces;

import clase_5.patrones_MVC_Adapter_y_Strategy.clases.*;

// Mi interfaz de patrón Strategy
public interface EstrategiaNotificacion {
    void enviar(Mensaje mensaje, Cliente cliente);
}
