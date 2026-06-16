package clase_9.factory;

class Ship implements Transport {
    @Override
    public void deliver() {
        System.out.println("Entregando contenedores por mar en un barco."); }
}