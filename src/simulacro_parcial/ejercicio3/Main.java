package simulacro_parcial.ejercicio3;

public class Main {
    public static void main(String[] args) {
        // 1. Creación de estación

        Estacion estacionArgentina = new Estacion(200);
        // 2. Instanciamos observadores
        Buque barco1 = new Buque();
        Buque barco2 = new Buque();

        // 3. Los registramos (acoplamos dinámicamente)
        estacionArgentina.agregar(barco1);
        estacionArgentina.agregar(barco2);

        // 4. Simulamos el cambio de marea (esto disparará el notificar)
        estacionArgentina.setMarea(250);



    }
}
