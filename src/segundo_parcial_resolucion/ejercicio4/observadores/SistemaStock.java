package segundo_parcial_resolucion.ejercicio4.observadores;

import segundo_parcial_resolucion.ejercicio4.iObserver;

public class SistemaStock implements iObserver {
    @Override
    public void actualizar(String informacion) {
        System.out.println("NotificacionesCorreo");
    }

}
