package clase_7.Ejercicio_For_Sale.ClasesHijas;

import clase_7.Ejercicio_For_Sale.Inmueble;

public class Depto extends Inmueble {
    private int ambientes;
    @Override
    public double precioParticular() {
        return ambientes * 350000;
    }
}