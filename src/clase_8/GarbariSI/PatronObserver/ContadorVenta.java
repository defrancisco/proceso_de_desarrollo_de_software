package clase_8.GarbariSI.PatronObserver;

import clase_8.GarbariSI.Producto;

public class ContadorVenta implements Observer {

    // es una pequeña parte del sistema que sólo lleva la cuenta de
    //la cantidad diaria de ventas producidas (1,2,3...). Sirve para el control cruzado: para
    //realizar el arqueo del cajero, para verificar el stock del depósito, y para verificar los
    //libros contables.
    private int cantidadVentas = 0;

    @Override
    public void update(Producto p){
        cantidadVentas++; // contador
        System.out.println("[CONTADOR] Venta Número: " + cantidadVentas + " registradas.");
    }
}
