package clase_6.modulo_Pedidos_Cafe.cafeteria;

public class Main {
    public static void main(String[] args) {

        // --- CASO 1: Un café simple común y corriente ---
        clase_6.modulo_Pedidos_Cafe.cafeteria.Bebida cafeSolo = new clase_6.modulo_Pedidos_Cafe.cafeteria.CafeSimple();
        System.out.println("Pedido 1:");
        System.out.println("Detalle: " + cafeSolo.getDescripcion());
        System.out.println("Precio: $" + cafeSolo.getPrecio());
        System.out.println("----------------------------------------------\n");

        // --- CASO 2: Un café con leche y chocolate ---
        // Explicación de la línea de abajo:
        // 1. Instanciamos el CafeSimple
        // 2. Lo metemos dentro de Leche
        // 3. Todo ese resultado lo metemos dentro de Chocolate
        clase_6.modulo_Pedidos_Cafe.cafeteria.Bebida cafeEspecial = new clase_6.modulo_Pedidos_Cafe.cafeteria.ConChocolate(new clase_6.modulo_Pedidos_Cafe.cafeteria.ConLeche(new clase_6.modulo_Pedidos_Cafe.cafeteria.CafeSimple()));

        System.out.println("Pedido 2 (Combinación Dinámica):");
        System.out.println("Detalle: " + cafeEspecial.getDescripcion());
        // El precio final va a ser: 1500 (café) + 300 (leche) + 450 (chocolate) = 2250
        System.out.println("Precio Total: $" + cafeEspecial.getPrecio());
        System.out.println("----------------------------------------------\n");

        // --- CASO 3: Un café súper personalizado (Doble azúcar, leche y chocolate) ---
        // Como cada decorador sigue siendo una "Bebida", podés anidarlos cuantas veces quieras
        clase_6.modulo_Pedidos_Cafe.cafeteria.Bebida pedidoLoco = new clase_6.modulo_Pedidos_Cafe.cafeteria.ConAzucar(new clase_6.modulo_Pedidos_Cafe.cafeteria.ConAzucar(new clase_6.modulo_Pedidos_Cafe.cafeteria.ConChocolate(new clase_6.modulo_Pedidos_Cafe.cafeteria.ConLeche(new clase_6.modulo_Pedidos_Cafe.cafeteria.CafeSimple()))));

        System.out.println("Pedido 3 (Acumulativo repetido):");
        System.out.println("Detalle: " + pedidoLoco.getDescripcion());
        System.out.println("Precio Total: $" + pedidoLoco.getPrecio());
    }
}
