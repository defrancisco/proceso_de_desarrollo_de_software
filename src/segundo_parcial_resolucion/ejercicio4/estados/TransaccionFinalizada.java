package segundo_parcial_resolucion.ejercicio4.estados;

import segundo_parcial_resolucion.ejercicio4.ProcesadorPagos;
import segundo_parcial_resolucion.ejercicio4.iEstadosProcesador;

public class TransaccionFinalizada implements iEstadosProcesador {


    @Override
    public void verificar(ProcesadorPagos procesador) {
        System.out.println("Operación Inválida: La transacción ya concluyó de forma definitiva");
    }

    @Override
    public void emitirComprobante(ProcesadorPagos procesador) {
        System.out.println("Re-Imprimiendo duplicado del comprobante histórico");
    }
}
