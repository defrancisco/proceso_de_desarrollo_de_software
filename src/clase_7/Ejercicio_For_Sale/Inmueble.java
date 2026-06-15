package clase_7.Ejercicio_For_Sale;

import clase_7.Ejercicio_For_Sale.ClasesHijas.Zona;

public abstract class Inmueble {
    protected double metrosCuadrados;
    protected Zona zona;

    public double valor() {
        return precioParticular() + zona.getPlus();
    }
    public abstract double precioParticular();
}
