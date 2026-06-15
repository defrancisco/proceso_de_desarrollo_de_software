package clase_9.factory;

class EarthLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Bicycle(); // SeaLogistics decide usar Barcos
    }
}