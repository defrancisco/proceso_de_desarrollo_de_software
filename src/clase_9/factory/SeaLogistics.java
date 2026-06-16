package clase_9.factory;


class SeaLogistics extends Logistics {
    @Override
    public Transport createTransport() {
        return new Ship(); // SeaLogistics decide usar Barcos
    }
}