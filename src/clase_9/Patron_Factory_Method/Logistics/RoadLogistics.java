package clase_9.Patron_Factory_Method.Logistics;

import clase_9.Patron_Factory_Method.Logistics.transportes.Truck;
import clase_9.Patron_Simple_Factory.Logistics.TransportFactory;

public class RoadLogistics extends Logistics  {


    @Override
    public Transport createTransport() {
        return new Truck();

        // RoadLogistics decide usar Camiones
    }
}
