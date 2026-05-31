package clase_6.modulo_de_Stock_y_Precios;

public class Main {
    public static void main(String[] args) {
        // --- 1. CREACIÓN DE PRODUCTOS INDIVIDUALES (Hojas del Composite) ---
        clase_6.modulo_de_Stock_y_Precios.ProductoSimple casco = new clase_6.modulo_de_Stock_y_Precios.ProductoSimple("Casco Premium", 50000.0, 5);
        clase_6.modulo_de_Stock_y_Precios.ProductoSimple guantes = new clase_6.modulo_de_Stock_y_Precios.ProductoSimple("Guantes de Cuero", 15000.0, 12);
        clase_6.modulo_de_Stock_y_Precios.ProductoSimple chaleco = new clase_6.modulo_de_Stock_y_Precios.ProductoSimple("Chaleco Reflector", 10000.0, 3);
        clase_6.modulo_de_Stock_y_Precios.ProductoSimple moto = new clase_6.modulo_de_Stock_y_Precios.ProductoSimple("Moto 150cc", 1800000.0, 2);

        System.out.println("=== 1. Prueba de Producto Simple ===");
        System.out.println("Descripción: " + casco.getDescripcion());
        System.out.println("Precio: $" + casco.getPrecio());
        System.out.println("Stock disponible: " + casco.getStock() + " unidades");
        System.out.println("-------------------------------------------------------------------\n");


        // --- 2. CREACIÓN DE UN COMBO BÁSICO (Composite) ---
        // Guantes + Casco + Chaleco
        clase_6.modulo_de_Stock_y_Precios.Combo comboAccesorios = new clase_6.modulo_de_Stock_y_Precios.Combo("Combo Seguridad Moto");
        comboAccesorios.agregarItem(guantes);
        comboAccesorios.agregarItem(casco);
        comboAccesorios.agregarItem(chaleco);

        System.out.println("=== 2. Prueba de Combo (Composite) ===");
        System.out.println("Descripción: " + comboAccesorios.getDescripcion());
        System.out.println("Precio Combo (Suma de partes): $" + comboAccesorios.getPrecio());
        // El stock del combo debe ser 3, porque es el stock limitante del chaleco
        System.out.println("Stock estimado del Combo: " + comboAccesorios.getStock() + " unidades");
        System.out.println("-------------------------------------------------------------------\n");


        // --- 3. CREACIÓN DE UN COMBO DE COMBOS (Composite Avanzado) ---
        // Combinamos la Moto con el Combo de Accesorios anterior
        clase_6.modulo_de_Stock_y_Precios.Combo megaCombo = new clase_6.modulo_de_Stock_y_Precios.Combo("Mega Combo Moto + Equipamiento");
        megaCombo.agregarItem(moto);
        megaCombo.agregarItem(comboAccesorios); // Anidación exitosa gracias al polimorfismo


        // --- 4. APLICACIÓN DE DECORADORES (Packaging y Descuentos) ---
        // Al mega combo le añadimos una caja de madera de presentación (Packaging)
        clase_6.modulo_de_Stock_y_Precios.Vendible comboConEmpaque = new clase_6.modulo_de_Stock_y_Precios.PackagingDecorator(megaCombo, "Caja de Madera Especial", 2500.0);

        // Al combo con empaque le aplicamos un primer descuento del 10%
        clase_6.modulo_de_Stock_y_Precios.Vendible conPrimerDescuento = new clase_6.modulo_de_Stock_y_Precios.DescuentoDecorator(comboConEmpaque, 10.0);

        // Al resultado anterior le aplicamos otro descuento acumulable del 5% por pago en efectivo
        clase_6.modulo_de_Stock_y_Precios.Vendible pedidoFinalAcumulado = new clase_6.modulo_de_Stock_y_Precios.DescuentoDecorator(conPrimerDescuento, 5.0);

        System.out.println("=== 3. Prueba de Decoradores Acumulados sobre Combos ===");
        System.out.println("Descripción Final: " + pedidoFinalAcumulado.getDescripcion());
        System.out.println("Precio Final (Con Suma, Packaging y Descuentos Acumulados): $" + pedidoFinalAcumulado.getPrecio());
        System.out.println("Stock del Mega Combo total: " + pedidoFinalAcumulado.getStock() + " unidades");
    }
}
