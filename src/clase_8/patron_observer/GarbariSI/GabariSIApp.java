package clase_8.patron_observer.GarbariSI;

import clase_8.patron_observer.GarbariSI.PatronObserver.ContadorVenta;
import clase_8.patron_observer.GarbariSI.PatronObserver.Deposito;
import clase_8.patron_observer.GarbariSI.PatronObserver.OficinaContable;
import clase_8.patron_observer.GarbariSI.Strategy.El;
import clase_8.patron_observer.GarbariSI.Strategy.IVA;

public class GabariSIApp {
    public static void main(String[] args) {
        Sucursal sucursalCentral =  new Sucursal();

        // Configuro mis observadores
        sucursalCentral.attach(new ContadorVenta());
        sucursalCentral.attach(new Deposito());
        sucursalCentral.attach(new OficinaContable());

        // Configuro tipos de productos e impuestos
        TipoDeProducto electronica = new TipoDeProducto();
        electronica.addImpuestoAplicable(new IVA());
        electronica.addImpuestoAplicable(new El());

        Producto tv = new Producto("Smart TV", 200000.0,electronica);

        // Al vender, se disparan automáticamente todas las actualziaciones
        sucursalCentral.vender(tv);

    }
}
