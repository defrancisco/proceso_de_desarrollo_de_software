package clase_8.patron_observer.GarbariSI.Strategy;

import clase_8.patron_observer.GarbariSI.Producto;

public class El implements ImpuestoAplicable {
    private double gananciasImpositivas = 3.5;

    @Override
    public double aplicarImpuesto(Producto p) {
        return (p.getPrecioBase() / 4) + (0.3 * gananciasImpositivas);
    }
}
