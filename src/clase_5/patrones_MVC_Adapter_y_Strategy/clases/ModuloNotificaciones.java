package clase_5.patrones_MVC_Adapter_y_Strategy.clases;

import clase_5.patrones_MVC_Adapter_y_Strategy.interfaces.*;

public class ModuloNotificaciones {
    // Método que recibe un cliente y un mensaje, y delega en la estrategia del cliente
    public void notificar(Cliente cliente, Mensaje mensaje) {
        EstrategiaNotificacion estrategia = cliente.getMedioPreferido();
        estrategia.enviar(mensaje, cliente);
    }
}