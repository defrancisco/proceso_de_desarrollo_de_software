package clase_8.GarbariSI;

import clase_8.GarbariSI.PatronObserver.ContadorVenta;
import clase_8.GarbariSI.PatronObserver.Deposito;
import clase_8.GarbariSI.PatronObserver.OficinaContable;
import clase_8.GarbariSI.Strategy.El;
import clase_8.GarbariSI.Strategy.IVA;

public class GabariSIApp {
    public static void main(String[] args) {
        Sucursal sucursalCentral =  new Sucursal();

        // Configuro mis observadores
        sucursalCentral.attach(new ContadorVenta());
        sucursalCentral.attach(new Deposito());
        sucursalCentral.attach(new OficinaContable());

        // Configuro tipos de productos PatronStrategy impuestos
        TipoDeProducto electronica = new TipoDeProducto();
        electronica.addImpuestoAplicable(new IVA());
        electronica.addImpuestoAplicable(new El());

        Producto tv = new Producto("Smart TV", 200000.0,electronica);

        // Al vender, se disparan automáticamente todas las actualziaciones
        sucursalCentral.vender(tv);

    }
}
