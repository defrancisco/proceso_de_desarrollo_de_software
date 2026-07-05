package clase_6.Modulo_Cafeteria.Adicionales;

import clase_6.Modulo_Cafeteria.BebidaBase;
import clase_6.Modulo_Cafeteria.DecoradorBebida;

public class ConAzucar extends DecoradorBebida {
    public ConAzucar(BebidaBase bebida) {
        super(bebida);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", ConAzucar";
    }

    @Override
    public double precio() {
        return super.precio() + 100.0;
    }
}
