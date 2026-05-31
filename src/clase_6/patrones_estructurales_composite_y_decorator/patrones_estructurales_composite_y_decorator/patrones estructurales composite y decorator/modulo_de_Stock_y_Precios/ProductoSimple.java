package clase_6.modulo_de_Stock_y_Precios;

public class ProductoSimple implements clase_6.modulo_de_Stock_y_Precios.Vendible {
    private String nombre;
    private double precio;
    private int stock;

    public ProductoSimple(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    @Override
    public String getDescripcion(){
        return this.nombre;
    }

    @Override
    public double getPrecio(){
        return this.precio;
    }

    @Override
    public int getStock(){
        return this.stock;
    }
}
