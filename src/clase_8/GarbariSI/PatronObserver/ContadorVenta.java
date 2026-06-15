package clase_8.GarbariSI.PatronObserver;

import clase_8.GarbariSI.Producto;

public class ContadorVenta implements Observer {
    private int cantidadVentas = 0;

    @Override
    public void update(Producto p){
        cantidadVentas++; // contador
        System.out.println("[CONTADOR] Venta Número: " + cantidadVentas + " registradas.");
    }
}
