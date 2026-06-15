package clase_6.Patron_Decorator;

public class Cafeteria {
    public static void main(String[] args) {

        Bebida pedido1 = new CafeSimple();
        System.out.println(pedido1.getDescripcion() +" --> $" +pedido1.getPrecio());

        pedido1 = new ConLeche(pedido1);
        System.out.println(pedido1.getDescripcion() +" --> $" +pedido1.getPrecio());



    }
}
