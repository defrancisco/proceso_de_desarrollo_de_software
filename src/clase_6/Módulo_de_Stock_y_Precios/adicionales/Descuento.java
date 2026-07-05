package clase_6.Módulo_de_Stock_y_Precios.adicionales;

import clase_6.Módulo_de_Stock_y_Precios.Producto;
import clase_6.Módulo_de_Stock_y_Precios.ProductoDecorador;

public class Descuento extends ProductoDecorador {
    private double porcentaje;

    public Descuento(Producto producto, double porcentaje) {
        super(producto);
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() * (1 - porcentaje / 100);
    }

    @Override
    public String getNombre() {
        return getNombre();
    }

}
