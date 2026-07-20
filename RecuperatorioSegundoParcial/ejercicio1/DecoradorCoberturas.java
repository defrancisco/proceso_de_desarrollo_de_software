package ejercicio1;

public abstract class DecoradorCoberturas implements Poliza {

    protected Poliza poliza;


    // RECORDAR EL CONSTRUCTOR DEL DECORADOR
    public DecoradorCoberturas(Poliza poliza){
        this.poliza = poliza;
    }

    @Override
    public double calcularPrima() {
        return poliza.calcularPrima(); // Delega en la póliza envuelta
    }

    @Override
    public String descripcion() {
        return poliza.descripcion(); // Delega en la póliza envuelta
    }

}
