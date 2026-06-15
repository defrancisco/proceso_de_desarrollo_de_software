package clase_8.GarbariSI.Strategy;

import clase_8.GarbariSI.Producto;

public interface ImpuestoAplicable {
    double aplicarImpuesto(Producto p);
}
