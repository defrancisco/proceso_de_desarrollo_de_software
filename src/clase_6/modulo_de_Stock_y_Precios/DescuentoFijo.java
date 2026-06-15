package clase_6.modulo_de_Stock_y_Precios;

public class DescuentoFijo extends Decorado {
    private Double valor;

    public DescuentoFijo(Producto producto, Double valor) {
        super(producto);
        this.valor = valor;

    }

    @Override
    public Double precio(){
        return super.producto.precio() - this.valor;
    }
}
