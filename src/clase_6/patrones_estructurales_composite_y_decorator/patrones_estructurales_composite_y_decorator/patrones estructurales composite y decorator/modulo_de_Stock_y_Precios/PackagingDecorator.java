package clase_6.modulo_de_Stock_y_Precios;

public class PackagingDecorator  extends clase_6.modulo_de_Stock_y_Precios.VendibleDecorator {
    private String nombrePackaging;
    private double precioPackaging;

    public PackagingDecorator(clase_6.modulo_de_Stock_y_Precios.Vendible vendible, String nombrePackaging, double precioPackaging) {
        super(vendible);
        this.nombrePackaging = nombrePackaging;
        this.precioPackaging = precioPackaging;
    }

    @Override
    public String getDescripcion() {
        return super.getDescripcion() + " + Packaging [" + nombrePackaging + "]";
    }

    @Override
    public double getPrecio() {
        // Toma el precio acumulado y le suma el valor del packaging particular
        return super.getPrecio() + this.precioPackaging;
    }
}
