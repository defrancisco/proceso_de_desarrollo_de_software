package segundo_parcial_resolucion.ejercicio4.estados;

import segundo_parcial_resolucion.ejercicio4.ProcesadorPagos;
import segundo_parcial_resolucion.ejercicio4.iEstadosProcesador;

public class ProcesandoFondos implements iEstadosProcesador {


    @Override
    public void verificar(ProcesadorPagos procesador) {
        System.out.println("Procesando fondos de la comprobante");
        System.out.println("Procesando la transacción financiera...");
    }

    @Override
    public void emitirComprobante(ProcesadorPagos procesador) {
        System.out.println("Autorizando fondos de la entidad bancaria...");
        // Realizaría esto con éxtio
        procesador.setEstadoActual(new TransaccionFinalizada() );
        System.out.println("---Estado cambiado a: Transaccion Finalizada.");

        // Ejecución inmediata del trigger de notificación requerido
        procesador.notificar();


    }
}
