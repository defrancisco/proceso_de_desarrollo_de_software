package clase_6.Modulo_Cafeteria.Adicionales;

import clase_6.Modulo_Cafeteria.BebidaBase;
import clase_6.Modulo_Cafeteria.DecoradorBebida;

public class ConLeche extends DecoradorBebida {
    public ConLeche(BebidaBase bebida) {
        super(bebida);
    }

    @Override
    public String descripcion() {
        return super.descripcion() + ", ConLeche";
    }

    @Override
    public double precio() {
        return super.precio() + 1000.0;
    }
}
