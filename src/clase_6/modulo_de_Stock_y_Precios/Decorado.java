package clase_6.modulo_de_Stock_y_Precios;


;
public abstract class Decorado extends Producto {
    protected Producto producto;

    public Decorado(Producto producto) {
        this.producto = producto;
    }

    @Override
    public Integer stock() {
        return producto.stock();
    }
}
