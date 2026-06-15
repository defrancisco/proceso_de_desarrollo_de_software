package clase_7.Ejercicio_For_Sale.OperacionesyComisiones;

import clase_7.Ejercicio_For_Sale.Inmueble;
import clase_7.Ejercicio_For_Sale.Estados.Operacion;

public class Venta extends Operacion {
    private static double porcentajeComision = 0.015; // 1.5%

    public Venta(Inmueble inmueble) { super(inmueble); }

    @Override
    public double comisionParaEmpleado() {
        return inmueble.valor() * porcentajeComision;
    }
}