package clase_9.factory;

//LA SIMPLE FACTORY
class TransportSimpleFactory {
 public static Transport createTransport(String type) {
     if (type == null) return null;
     
     switch (type.toUpperCase()) {
         case "TRUCK":   return new Truck();
         case "BICYCLE": return new Bicycle();
         default: throw new IllegalArgumentException("Transporte no disponible.");
     }
 }
}