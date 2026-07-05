package clase_6.Módulo_de_Stock_y_Precios;

public abstract class ProductoDecorador implements Producto {
    protected Producto producto;

    public ProductoDecorador(Producto producto) {
        this.producto = producto;
    }


    public double getPrecio() {
        return getPrecio();
    }

    @Override
    public int getStock() {
        return getStock();
    }

    public String getNombre() {
        return getNombre();
    }
}
