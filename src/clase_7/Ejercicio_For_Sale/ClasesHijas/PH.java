package clase_7.Ejercicio_For_Sale.ClasesHijas;

import clase_7.Ejercicio_For_Sale.Inmueble;

public class PH extends Inmueble {
    @Override
    public double precioParticular() {
        double calculo = metrosCuadrados * 14000;
        return Math.max(calculo, 500000);
    }
}
