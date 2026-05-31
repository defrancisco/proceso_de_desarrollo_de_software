package clase_5.clases;

import clase_5.interfaces.EstrategiaNotificacion;

public class ModuloNotificaciones {

    // Método que recibe un cliente y un mensaje, y delega en la estrategia del cliente
    public void notificar(Cliente cliente, clase_5.clases.Mensaje mensaje) {
        EstrategiaNotificacion estrategia = cliente.getMedioPreferido();
        estrategia.enviar(mensaje, cliente);
    }
}