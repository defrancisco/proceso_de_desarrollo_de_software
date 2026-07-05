package clase_6.Modulo_Cafeteria.Adicionales;

import clase_6.Modulo_Cafeteria.BebidaBase;
import clase_6.Modulo_Cafeteria.DecoradorBebida;

public class ConChocolate extends DecoradorBebida {
    public ConChocolate(BebidaBase bebida) {
        super(bebida);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", ConChocolate";
    }

    @Override
    public double precio() {
        return super.precio() + 2000.0;
    }
}
