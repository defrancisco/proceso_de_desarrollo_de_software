package clase_8.patron_observer.GarbariSI.Strategy;

import clase_8.patron_observer.GarbariSI.Producto;

public class IVA implements ImpuestoAplicable {
    private double porcentaje = 0.21;

    @Override
    public double aplicarImpuesto(Producto p) {
        return p.getPrecioBase() * porcentaje;
    }
}
