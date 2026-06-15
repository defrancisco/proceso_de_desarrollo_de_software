package clase_6.modulo_Pedidos_Cafe.cafeteria;

public class ConLeche extends clase_6.modulo_Pedidos_Cafe.cafeteria.BebidaDecorator {

    public ConLeche(clase_6.modulo_Pedidos_Cafe.cafeteria.Bebida bebida) {
        super(bebida); // Pasa la bebida al constuctor del padre
    }

    @Override
    public String getDescripcion(){
        // Llama a lo que ya estaba acumulado y le concatena su ingrediente
        return super.getDescripcion() + " + Leche";
    }

    @Override
    public double getPrecio(){
        // Llama al precio acumulado de adentro y le suma el costo del extra
        return super.getPrecio() + 300.0;
    }



}
