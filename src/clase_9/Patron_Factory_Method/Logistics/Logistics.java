package clase_9.Patron_Factory_Method.Logistics;



//CREADOR ABSTRACTO
public abstract class Logistics {
    // ESTE ES EL FACTORY METHOD ORIGINAL
    public abstract Transport createTransport();

    public void planDelivery(){
        // Llama al método de fábrica para crear el objeto sin saber cuál es exactamente
        Transport transport = createTransport();
        System.out.println("Preparando la logística de envío...");
        transport.deliver(destino);
    }
}
