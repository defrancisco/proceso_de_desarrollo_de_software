package clase_6.modulo_Menus.Restaurante;

public class Main {
    public static void main(String[] args) {

        // 1. Creamos los platos individuales (Hojas)
        clase_6.modulo_Menus.Restaurante.ItemMenu polloAlLimon = new clase_6.modulo_Menus.Restaurante.PlatoIndividual("Pollo al Limón", 5000);
        clase_6.modulo_Menus.Restaurante.ItemMenu ensaladaFrutas = new clase_6.modulo_Menus.Restaurante.PlatoIndividual("Ensalada de Frutas", 2000);
        clase_6.modulo_Menus.Restaurante.ItemMenu gaseosa = new clase_6.modulo_Menus.Restaurante.PlatoIndividual("Gaseosa Cola", 1000);

        System.out.println("--- Pedido Individual ---");
        System.out.println("Plato: " + polloAlLimon.getNombre());
        System.out.println("Precio final: $" + polloAlLimon.getPrecio());

        // 2. Creamos el Menú Ejecutivo (Composite)
        clase_6.modulo_Menus.Restaurante.MenuPromocional menuEjecutivo = new clase_6.modulo_Menus.Restaurante.MenuPromocional("Menú Ejecutivo");

        // 3. Agregamos los platos al menú
        menuEjecutivo.agregarPlato(polloAlLimon);
        menuEjecutivo.agregarPlato(ensaladaFrutas);
        menuEjecutivo.agregarPlato(gaseosa);

        System.out.println("\n--- Pedido en Combo ---");
        System.out.println("Menú: " + menuEjecutivo.getNombre());
        // El precio debería ser (5000 + 2000 + 1000) = 8000 * 0.90 = $7200
        System.out.println("Precio final (con 10% OFF): $" + menuEjecutivo.getPrecio());
    }
}
