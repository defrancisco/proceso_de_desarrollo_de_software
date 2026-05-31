package clase_6.modulo_Pedidos_Cafe.cafeteria;

public class ConAzucar extends clase_6.modulo_Pedidos_Cafe.cafeteria.BebidaDecorator {

    public ConAzucar(clase_6.modulo_Pedidos_Cafe.cafeteria.Bebida bebida){
        super(bebida);
    }

    @Override
    public String getDescripcion(){
        return super.getDescripcion()+" + Azúcar";
    }

    @Override
    public double getPrecio(){
        return super.getPrecio() + 100.0;
    }
}
