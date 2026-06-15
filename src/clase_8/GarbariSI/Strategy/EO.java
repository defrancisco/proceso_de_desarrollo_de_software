package clase_8.GarbariSI.Strategy;

import clase_8.GarbariSI.Producto;

public class EO implements ImpuestoAplicable {
    private double gananciasImpositivas = 4.0;

    @Override
    public double aplicarImpuesto(Producto p) {
        return 0.5 * (p.getPrecioBase() / 4) * gananciasImpositivas;
    }


}