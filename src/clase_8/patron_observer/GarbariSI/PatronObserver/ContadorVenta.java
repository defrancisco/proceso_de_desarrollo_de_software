package clase_8.patron_observer.GarbariSI.PatronObserver;

import clase_8.patron_observer.GarbariSI.Producto;

public class ContadorVenta implements Observer {
    private int cantidadVentas = 0;

    @Override
    public void update(Producto p){
        cantidadVentas++; // contador
        System.out.println("[CONTADOR] Venta Número: " + cantidadVentas + " registradas.");
    }
}
