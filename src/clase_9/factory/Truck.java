package clase_9.factory;

class Truck implements Transport {
    @Override
    public void deliver() { System.out.println("Entregando carga por carretera en un camión."); }
}