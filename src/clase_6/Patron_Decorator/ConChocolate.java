package clase_6.Patron_Decorator;

public class ConChocolate extends DecoradorBebida{
    public ConChocolate(Bebida bebida) {
        super(bebida);
    }

    @Override
    public double getPrecio() {
        return bebida.getPrecio() + 2000.00;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", ConChocolate";
    }
}
