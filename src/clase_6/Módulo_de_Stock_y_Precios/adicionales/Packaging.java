package clase_6.Módulo_de_Stock_y_Precios.adicionales;

import clase_6.Módulo_de_Stock_y_Precios.Producto;
import clase_6.Módulo_de_Stock_y_Precios.ProductoDecorador;

public class Packaging extends ProductoDecorador {
    private Double costoPackaging;

    public Packaging(Producto producto, double costoPackaging) {

        super(producto);
        this.costoPackaging = costoPackaging;
    }

    @Override
    public double getPrecio() {
        return super.getPrecio() + costoPackaging;
    }


    @Override
    public String getNombre() {
        return getNombre();
    }

}
