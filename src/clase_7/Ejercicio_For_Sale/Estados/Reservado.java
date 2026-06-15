package clase_7.Ejercicio_For_Sale.Estados;

import clase_7.Ejercicio_For_Sale.Entidades.Cliente;
import clase_7.Ejercicio_For_Sale.Entidades.Empleado;

public class Reservado implements EstadoOperacion {
    private Cliente clienteQueReservo;
    private Empleado empleadoQueReservo;

    public Reservado(Cliente cliente, Empleado empleado) {
        this.clienteQueReservo = cliente;
        this.empleadoQueReservo = empleado;
    }

    @Override
    public void reservar(Cliente cliente, Empleado empleado, Operacion operacion) {
        throw new RuntimeException("La propiedad ya se encuentra reservada.");
    }

    @Override
    public void concretar(Cliente cliente, Empleado empleado, Operacion operacion) {
        if (this.clienteQueReservo.equals(cliente)) {
            operacion.setEstado(new Concretado());
            empleado.registrarOperacionCerrada(operacion.comisionParaEmpleado());
            // Lógica adicional para rastrear si el empleado concretó una reserva de otro
        } else {
            throw new RuntimeException("No se puede concretar: Reservado por otro cliente.");
        }
    }

    @Override
    public void cancelarReserva(Cliente cliente, Empleado empleado, Operacion operacion) {
        operacion.setEstado(new Disponible());
    }
}
