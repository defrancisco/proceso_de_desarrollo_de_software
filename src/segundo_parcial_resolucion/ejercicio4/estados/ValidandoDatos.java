package segundo_parcial_resolucion.ejercicio4.estados;

import segundo_parcial_resolucion.ejercicio4.ProcesadorPagos;
import segundo_parcial_resolucion.ejercicio4.iEstadosProcesador;

public class ValidandoDatos implements iEstadosProcesador {

    @Override
    public void verificar(ProcesadorPagos procesador) {
        System.out.println("Validando datos");

        // Asumo que son correctos
        procesador.setEstadoActual(new ProcesandoFondos());
        System.out.println("--- Estado cambiado a Procesando Fondos ---");
    }

    @Override
    public void emitirComprobante(ProcesadorPagos procesador) {
        // Requerimiento explícito: cualquier intento de llamar a esto debería lanzar error
        throw new IllegalStateException("Error: No se puede emitirComprobante");

    }
}
