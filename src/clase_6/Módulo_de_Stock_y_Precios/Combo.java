package clase_6.Módulo_de_Stock_y_Precios;

import java.util.ArrayList;
import java.util.List;

public class Combo implements Producto{
    private List<Producto> productos;


    public Combo(String comboSeguridadRuta) {
        this.productos = new ArrayList<>();
    }

    @Override
    public double getPrecio() {
        double montoTotal = 0;

        for(Producto p: productos){
            montoTotal += p.getPrecio();
        }

        return montoTotal;
    }

    @Override
    public int getStock() {
        if (productos.isEmpty()) return 0;
        return productos.stream().mapToInt(Producto::getStock).min().orElse(0);
    }

    @Override
    public String getNombre() {
        return "Combo";
    }


    public void agregarItem(Producto producto){
        this.productos.add(producto);
    }

    public void eliminarProducto(Producto producto){
        this.productos.remove(producto);
    }
}
