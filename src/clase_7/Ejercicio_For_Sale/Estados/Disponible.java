package clase_7.Ejercicio_For_Sale.Estados;

import clase_7.Ejercicio_For_Sale.Entidades.Cliente;
import clase_7.Ejercicio_For_Sale.Entidades.Empleado;

public class Disponible implements EstadoOperacion {
    @Override
    public void reservar(Cliente cliente, Empleado empleado, Operacion operacion) {
        operacion.setEstado(new Reservado(cliente, empleado));
        empleado.incrementarReservas();
        System.out.println("Propiedad reservada con éxito.");
    }

    @Override
    public void concretar(Cliente cliente, Empleado empleado, Operacion operacion) {
        operacion.setEstado(new Concretado());
        empleado.registrarOperacionCerrada(operacion.comisionParaEmpleado());
        System.out.println("Operación concretada directamente.");
    }

    @Override
    public void cancelarReserva(Cliente c, Empleado e, Operacion o) {
        System.out.println("No se puede cancelar: La propiedad no estaba reservada.");
    }
}