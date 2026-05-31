package clase_6.modulo_Pedidos_Cafe.cafeteria;

public class CafeSimple implements clase_6.modulo_Pedidos_Cafe.cafeteria.Bebida {

    @Override
    public String getDescripcion() {
        return "Café Simple";
    }

    @Override
    public double getPrecio() {
        return 1500.0; // precio base del café solo
    }
}
