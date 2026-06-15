package clase_7.Ejercicio_For_Sale.Estados;

import clase_7.Ejercicio_For_Sale.Entidades.Cliente;
import clase_7.Ejercicio_For_Sale.Entidades.Empleado;

public interface EstadoOperacion {
    void reservar(Cliente cliente, Empleado empleado, Operacion operacion);
    void concretar(Cliente cliente, Empleado empleado, Operacion operacion);
    void cancelarReserva(Cliente cliente, Empleado empleado, Operacion operacion);
}
