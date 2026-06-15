package clase_6.Patron_Decorator;

public class DecoradorBebida implements Bebida {
    //1 clase PROTEGIDA
    protected Bebida bebida;

    public DecoradorBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public String getDescripcion() {
        return bebida.getDescripcion();
    }

    public double getPrecio() {
        return bebida.getPrecio();
    }
}
