package clase_6.modulo_de_Stock_y_Precios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Combo extends Producto {

    private List<clase_6.modulo_de_Stock_y_Precios.Producto> productos;

    public Combo(){
        this.productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p){
        this.productos.add(p);
    }

    public void eliminarProducto(Producto p){
        this.productos.remove(p);
    }


    public Double precio() {
        return this.productos
                .stream()
                .mapToDouble(Producto::precio) // p -> p.precio()
                .sum();
    }

    public Integer stock() {
        return Collections
                .min(
                        this.productos,
                        Comparator.comparing(Producto::stock)
                )
                .stock();
    }

}
