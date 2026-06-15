package clase_9.factory;

class Bicycle implements Transport {
    @Override
    public void deliver() { System.out.println("Entregando paquete en la ciudad en una bicicleta."); }
}
