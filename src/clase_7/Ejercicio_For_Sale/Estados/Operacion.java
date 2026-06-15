package clase_7.Ejercicio_For_Sale.Estados;

import clase_7.Ejercicio_For_Sale.Entidades.Cliente;
import clase_7.Ejercicio_For_Sale.Entidades.Empleado;
import clase_7.Ejercicio_For_Sale.Inmueble;

public abstract class Operacion {
    protected EstadoOperacion estado;
    protected Inmueble inmueble;

    public Operacion(Inmueble inmueble) {
        this.inmueble = inmueble;
        this.estado = new Disponible();
    }

    public void setEstado(EstadoOperacion estado) { this.estado = estado; }
    
    public abstract double comisionParaEmpleado();

    // Métodos delegados al State
    public void reservar(Cliente c, Empleado e) { estado.reservar(c, e, this); }
    public void concretar(Cliente c, Empleado e) { estado.concretar(c, e, this); }
}
