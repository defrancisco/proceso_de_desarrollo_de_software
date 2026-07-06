package clase_9.Patron_Factory_Method.Logistics;

import clase_9.Patron_Factory_Method.Logistics.transportes.Ship;

public class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
