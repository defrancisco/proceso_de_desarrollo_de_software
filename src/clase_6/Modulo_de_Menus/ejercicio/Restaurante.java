package clase_6.Modulo_de_Menus.ejercicio;

import java.awt.*;

public class Restaurante {
    public static void main(String[] args) {
        PlatoIndividual plato = new PlatoIndividual("Sopa de Cebolla", 2000.0);
        PlatoIndividual plato2 = new PlatoIndividual("Sopa de Calabaza", 2000.0);
        PlatoIndividual te = new PlatoIndividual("Té", 1000.0);
        PlatoIndividual agua = new PlatoIndividual("Agua", 1000.0);

        System.out.println("Plato " + plato.nombre() + " | Precio sin descuento: "+ plato.precio(true));
        System.out.println("Plato "+ plato.nombre()+ " | Precio sin descuento: "+ plato2.precio(false));

        MenuEjecutivo menuEjecutivo1 = new MenuEjecutivo("Ejecutivo 1");
        MenuEjecutivo menuEjecutivo2 = new MenuEjecutivo("Ejecutivo 2");

        menuEjecutivo1.agregar(plato);
        menuEjecutivo1.agregar(te);

        menuEjecutivo2.agregar(plato2);
        menuEjecutivo2.agregar(agua);

        System.out.println("Menu Ejecutivo 1: " + menuEjecutivo1.nombre() + " | Precio:  "+ menuEjecutivo1.precio(true));


    }
}
