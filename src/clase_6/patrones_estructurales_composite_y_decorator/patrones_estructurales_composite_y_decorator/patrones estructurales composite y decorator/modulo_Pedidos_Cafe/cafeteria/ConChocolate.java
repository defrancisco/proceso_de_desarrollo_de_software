package clase_6.modulo_Pedidos_Cafe.cafeteria;

public class ConChocolate extends clase_6.modulo_Pedidos_Cafe.cafeteria.BebidaDecorator {

    public ConChocolate(clase_6.modulo_Pedidos_Cafe.cafeteria.Bebida bebida){
        super(bebida); // Pasa la bebida al constructor del padre
    }

    @Override
    public String getDescripcion(){
        return super.getDescripcion()+" + Chocolate";
    }

    @Override
    public double getPrecio(){
        return super.getPrecio() + 800.0;
    }

}
