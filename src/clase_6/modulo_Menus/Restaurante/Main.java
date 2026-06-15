package clase_6.modulo_Menus.Restaurante;

public class Main {
    public static void main(String[] args) {
        // Creamos los platos individuales
        ItemMenu pollo = new PlatoIndividual("Pollo al Limón", 1500.00);
        ItemMenu ensalada = new PlatoIndividual("Ensalada de Frutas", 500.00);
        ItemMenu gaseosa = new PlatoIndividual("Gaseosa", 300.00);

        // Caso 1: Pedido individual
        System.out.println("Pedido simple: " + pollo.getNombre() + " - Precio: $" + pollo.getPrecio(true));

        // Caso 2: Armado de Menú Ejecutivo (Composite)
        MenuPromocional menuEjecutivo = new MenuPromocional("Menú Ejecutivo");
        menuEjecutivo.agregarItem(pollo);
        menuEjecutivo.agregarItem(ensalada);
        menuEjecutivo.agregarItem(gaseosa);

        MenuPromocional menuEjecutivo2 = new MenuPromocional("Menú Ejecutivo");
        menuEjecutivo2.agregarItem(pollo);
        menuEjecutivo2.agregarItem(ensalada);
        menuEjecutivo2.agregarItem(gaseosa);

        MenuPromocional menuEjecutivo3 = new MenuPromocional("Menú Completo");
        menuEjecutivo3.agregarItem(menuEjecutivo2);
        menuEjecutivo3.agregarItem(menuEjecutivo);

        // El precio mostrará el total de 2300 con el 10% de descuento aplicado (2070)
        System.out.println("Pedido " + menuEjecutivo3.getNombre() + " - Precio Final: $" + menuEjecutivo.getPrecio(true));

    }
}
