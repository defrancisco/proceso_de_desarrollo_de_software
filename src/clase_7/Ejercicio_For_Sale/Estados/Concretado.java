package clase_7.Ejercicio_For_Sale.Estados;

import clase_7.Ejercicio_For_Sale.Entidades.Cliente;
import clase_7.Ejercicio_For_Sale.Entidades.Empleado;

public class Concretado implements EstadoOperacion {
    @Override
    public void reservar(Cliente c, Empleado e, Operacion o) { throw new RuntimeException("Ya vendida/alquilada."); }
    @Override
    public void concretar(Cliente c, Empleado e, Operacion o) { throw new RuntimeException("Ya vendida/alquilada."); }
    @Override
    public void cancelarReserva(Cliente c, Empleado e, Operacion o) { throw new RuntimeException("Operación ya cerrada."); }
}