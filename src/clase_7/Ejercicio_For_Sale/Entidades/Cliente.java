package clase_7.Ejercicio_For_Sale.Entidades;

public class Cliente {
    private String nombre;
    private String apellido;

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    // El equals es importante para que el estado 'Reservado' 
    // valide si el cliente que concreta es el mismo que reservó.
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Cliente cliente = (Cliente) obj;
        return nombre.equals(cliente.nombre) && apellido.equals(cliente.apellido);
    }
}