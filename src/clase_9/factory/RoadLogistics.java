package clase_9.factory;

class RoadLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Truck(); // RoadLogistics decide usar Camiones
    }
}
