package clase_8.patron_observer.GarbariSI.Strategy;

import clase_8.patron_observer.GarbariSI.Producto;

public interface ImpuestoAplicable {
    double aplicarImpuesto(Producto p);
}
