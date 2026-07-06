package clase_9.Patron_Singleton.Patron_Singleton_101;

public class Singleton {

    // Es importante que sea estatica
    private static Singleton instancia = null;

    public static Singleton getInstance() {
        // Si la instancia no se ha creado la creo,
        if(instancia == null) {
            instancia = new Singleton();
        }
        // entonces devuelvo la instancia ya creada
        return instancia;
    }

    // CONSTRUCTOR PRIVADO
    private Singleton() {
        // inicializar la instancia
    }
}
