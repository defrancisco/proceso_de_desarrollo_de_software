package clase_6.Módulo_de_Stock_y_Precios;

public class ProductoSimple implements Producto {

    public  ProductoSimple() {

    }

    public ProductoSimple(String chalecoReflector, double v, int i) {
    }

    @Override
    public String getNombre() {
        return "Casco";
    }

    @Override
    public double getPrecio() {
        return 20000.0;
    }

    @Override
    public int getStock() {
        return 90;
    }
}