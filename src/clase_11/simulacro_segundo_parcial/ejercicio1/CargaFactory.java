package clase_11.simulacro_segundo_parcial.ejercicio1;

import clase_11.simulacro_segundo_parcial.ejercicio1.composite.Combinados;
import clase_11.simulacro_segundo_parcial.ejercicio1.composite.PaqueteIndividual;

public class CargaFactory {
    public static iPaquete crearCarga(FormatoCarga tipo) {
        switch (tipo) {
            case SIMPLE:
                return new PaqueteIndividual(10, 500);
            case COMPUESTO:
                return new Combinados();
            default:
                throw new IllegalArgumentException("Formato no válido");
        }

    }
}
