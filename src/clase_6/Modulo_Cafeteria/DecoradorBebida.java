package clase_6.Modulo_Cafeteria;

public abstract class DecoradorBebida implements BebidaBase {
    protected BebidaBase cafe;

    public DecoradorBebida(BebidaBase cafesimple) {
        this.cafe = cafesimple;
    }

    @Override
    public double precio() {
        return cafe.precio();
    }

    @Override
    public String descripcion() {
        return cafe.descripcion();
    }
}
