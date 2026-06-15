package clase_7.Ejercicio_For_Sale.OperacionesyComisiones;

import clase_7.Ejercicio_For_Sale.Inmueble;
import clase_7.Ejercicio_For_Sale.Estados.Operacion;

public class Alquiler extends Operacion {
    private int cantMeses;
    private final double divisor = 50000;

    public Alquiler(Inmueble inmueble, int meses) { super(inmueble); this.cantMeses = meses; }

    @Override
    public double comisionParaEmpleado() {
        return (cantMeses * inmueble.valor()) / divisor;
    }
}


