package ejercicio1;

public abstract class DecoradorCoberturas implements Poliza {

    protected Poliza poliza;

    public double getPrimaBase() {
        return poliza.calcularPrima();
    }

    public String getDescripcion() {
        return poliza.descripcion();
    }

}
