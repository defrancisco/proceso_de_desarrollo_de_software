package clase_6.Módulo_de_Stock_y_Precios;

import clase_6.Módulo_de_Stock_y_Precios.adicionales.Descuento;
import clase_6.Módulo_de_Stock_y_Precios.adicionales.Packaging;

public class LocalComercial {
    public static void main(String[] args) {

        // 1. Instanciamos las hojas (Productos simples de la tienda de motos)
        Producto casco = new ProductoSimple("Casco Modular", 60000.0, 5); // Suponiendo que tu hoja se llama ProductoConcrete o ProductoSimple
        Producto guantes = new ProductoSimple("Guantes de Cuero", 20000.0, 10);
        Producto chaleco = new ProductoSimple("Chaleco Reflector", 15000.0, 3);

        // 2. Armamos el Composite (Combo)
        Combo comboSeguridad = new Combo("Combo Seguridad Ruta");
        comboSeguridad.agregarItem(casco);
        comboSeguridad.agregarItem(guantes);
        comboSeguridad.agregarItem(chaleco);

        System.out.println("=== Estructura Base (Composite) ===");
        System.out.println("Nombre: " + comboSeguridad.getNombre());
        System.out.println("Precio Combo (Suma): $" + comboSeguridad.getPrecio()); // 60k + 20k + 15k = 95000
        System.out.println("Stock Limitante del Combo: " + comboSeguridad.getStock() + " unidades");
        System.out.println("--------------------------------------------------");

        // 3. Aplicamos Decoradores al Combo Completo
        // Envolvemos el combo en un packaging especial (ej: Caja de madera premium de $3000)
        Producto comboConCaja = new Packaging(comboSeguridad, 3000.0);

        // Envolvemos el combo empaquetado con un descuento del 10%
        Producto comboFinalConDescuento = new Descuento(comboConCaja, 10.0);

        System.out.println("=== Estructura Decorada (Decorator + Composite) ===");
        System.out.println("Detalle Final: " + comboFinalConDescuento.getNombre());
        // Matemática: (95000 + 3000) = 98000 * 0.90 = $88200
        System.out.println("Precio Final con Extras y Descuento: $" + comboFinalConDescuento.getPrecio());
        System.out.println("Stock Final: " + comboFinalConDescuento.getStock() + " unidades");
    }
}
