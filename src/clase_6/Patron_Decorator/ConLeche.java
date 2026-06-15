package clase_6.Patron_Decorator;

public class ConLeche extends DecoradorBebida{
    public ConLeche(Bebida bebida){
        super(bebida);
    }


    @Override
    public double getPrecio() {
        return bebida.getPrecio() + 1000.00;
    }

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion() + ", Con Leche";
    }


}
