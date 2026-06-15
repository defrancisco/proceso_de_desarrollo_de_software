package clase_6.Patron_Decorator;

public class ConCaramelo extends DecoradorBebida{
    public ConCaramelo(Bebida bebida){
        super(bebida);
    };

    @Override
    public String getDescripcion() {
        return "ConCaramelo";
    }

    @Override
    public double getPrecio() {
        return 1200.00;
    }
}
