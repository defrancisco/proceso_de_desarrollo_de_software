package clase_6.modulo_de_Stock_y_Precios;

public class Main {
    public static void main(String[] args) {
        ProductoSimple guantes = new ProductoSimple(2, 2500.00);
        ProductoSimple chaleco = new ProductoSimple(5, 1800.00);

        Combo comboBasico = new Combo();
        comboBasico.agregarProducto(guantes);
        comboBasico.agregarProducto(chaleco);

        System.out.println("El precio del combo basico es de: $"
                + comboBasico.precio());

        Combo comboPremium = new Combo();
        comboPremium.agregarProducto(comboBasico);

        ProductoSimple casco = new ProductoSimple(10, 3000.00);
        comboPremium.agregarProducto(casco);

        System.out.println("El precio del combo premium es de: $"
                + comboPremium.precio());

        System.out.println("El stock del combo basico es de: "
                + comboBasico.stock() + " unidades");
        System.out.println("El stock del combo premium es de: "
                + comboPremium.stock() + " unidades");

        DescuentoFijo descuento200Pesos = new DescuentoFijo(comboPremium, 200.00);

        System.out.println("El precio final del combo premium con descuento es de: $"
                + descuento200Pesos.precio());

        DescuentoFijo descuento100Pesos = new DescuentoFijo(descuento200Pesos, 100.00);

        System.out.println("El precio final del combo premium con descuento adicional es de: $"
                + descuento100Pesos.precio());

        Packaging paqueteGrande = new Packaging(descuento100Pesos, 500.00);

        System.out.println("El precio final del combo premium incluyendo descuentos y packaging es de: $"
                + paqueteGrande.precio());
    }
}
