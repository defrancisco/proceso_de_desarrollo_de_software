package clase_9.Patron_Simple_Factory.Logistics;


public class TransportFactory {

    public static iTransporte asignarTransporte(String tipo) {
        iTransporte transporte = null;
        switch (tipo) {
            case "BICI": transporte = new Bicycle(); break;
            case "CAMION": transporte = new Truck(); break;
            //RECORDAR EL MANEJO DE ERRORES
            default: throw new IllegalArgumentException("Transporte no disponible.");
        }
        return transporte;
    }

    // OTRA VERSIÓN
    // if (type == null) return null;
    //switch (type.toUpperCase()) {
    //case "TRUCK":   return new Truck();
    //case "BICYCLE": return new Bicycle();
    //default: throw new IllegalArgumentException("Transporte no disponible.");}
}
