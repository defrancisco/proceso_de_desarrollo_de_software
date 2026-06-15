package clase_7.Ejercicio_For_Sale;

import clase_7.Ejercicio_For_Sale.ClasesHijas.Depto;
import clase_7.Ejercicio_For_Sale.ClasesHijas.Zona;
import clase_7.Ejercicio_For_Sale.Entidades.Cliente;
import clase_7.Ejercicio_For_Sale.Entidades.Empleado;
import clase_7.Ejercicio_For_Sale.Estados.Operacion;
import clase_7.Ejercicio_For_Sale.OperacionesyComisiones.Venta;

public class InmobiliariaApp {
    public static void main(String[] args) {
        // 1. Configuración inicial
        Zona palermo = new Zona("Palermo", 50000.0);
        
        Depto depto1 = new Depto(); // Implementado en el paso anterior
        // Seteamos valores para el cálculo: 2 ambientes en Palermo
        // Precio: (2 * 350.000) + 50.000 = 750.000
        // (Nota: asegúrate de agregar setters o constructores a tus clases de Inmueble)
        
        Empleado juan = new Empleado();
        Cliente ana = new Cliente("Ana", "García");
        Cliente pedro = new Cliente("Pedro", "Pérez");

        Operacion ventaDepto = new Venta(depto1);

        System.out.println("--- Inicio de Operación ---");

        // 2. Ana reserva el departamento a través de Juan
        try {
            ventaDepto.reservar(ana, juan);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 3. Pedro intenta comprarlo (Debería fallar porque está reservado por Ana)
        System.out.println("\n--- Intento de compra por Pedro ---");
        try {
            ventaDepto.concretar(pedro, juan);
        } catch (Exception e) {
            System.out.println("Error esperado: " + e.getMessage());
        }

        // 4. Ana concreta la operación
        System.out.println("\n--- Concreción por Ana ---");
        try {
            ventaDepto.concretar(ana, juan);
            System.out.println("Comisión generada para Juan: $" + ventaDepto.comisionParaEmpleado());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // 5. Verificamos estadísticas del empleado
        System.out.println("\n--- Estadísticas de Juan ---");
        System.out.println("Operaciones cerradas: " + juan.getCantOperacionesConcretadas());
        System.out.println("Total comisiones: $" + juan.totalComisiones());
        System.out.println("Total reservas realizadas: " + juan.getCantReservas());
        
        // 6. Intento de operar sobre algo ya concretado (Debería fallar)
        System.out.println("\n--- Intento de reserva sobre inmueble vendido ---");
        try {
            ventaDepto.reservar(ana, juan);
        } catch (Exception e) {
            System.out.println("Error esperado: " + e.getMessage());
        }
    }
}