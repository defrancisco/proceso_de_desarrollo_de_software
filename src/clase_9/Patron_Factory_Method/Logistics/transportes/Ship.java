package clase_9.Patron_Factory_Method.Logistics.transportes;

import clase_9.Patron_Factory_Method.Logistics.RoadLogistics;
import clase_9.Patron_Factory_Method.Logistics.Transport;

public class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Enviando por Barco..");
    }


}
