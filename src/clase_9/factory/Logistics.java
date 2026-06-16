package clase_9.factory;

import clase_9.factory.Transport;

//CREADOR ABSTRACTO
public abstract class Logistics {
 
 // Este es el FACTORY METHOD original
 public abstract Transport createTransport();

 // Lógica de negocio común a cualquier tipo de logística
 public void planDelivery() {
     // Llama al método de fábrica para crear el objeto sin saber cuál es exactamente
     Transport transport = createTransport();
     System.out.println("Preparando la logística de envío...");
     transport.deliver();
 }
}
