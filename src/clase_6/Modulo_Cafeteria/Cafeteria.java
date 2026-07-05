package clase_6.Modulo_Cafeteria;

import clase_6.Modulo_Cafeteria.Adicionales.ConAzucar;
import clase_6.Modulo_Cafeteria.Adicionales.ConChocolate;
import clase_6.Modulo_Cafeteria.Adicionales.ConLeche;

public class Cafeteria {
    public static void main(String[] args) {

        System.out.println("---Cafeteria---");
        System.out.println(" ");

        System.out.println("---Cafe 1---");
        CafeSimple cafeSimple = new CafeSimple();
        System.out.println(cafeSimple.descripcion() + " | " + cafeSimple.precio());
        System.out.println(" ");

        System.out.println("---Cafe 2---");
        BebidaBase cafeSimple2 = new ConAzucar(new CafeSimple());
        System.out.println(cafeSimple2.descripcion() + " | " + cafeSimple2.precio());
        System.out.println(" ");

        System.out.println("---Cafe 3---");
        BebidaBase cafeSimple3 = new ConLeche(new ConChocolate(new ConAzucar(new CafeSimple())));
        System.out.println(cafeSimple3.descripcion() + " | " + cafeSimple3.precio());
        System.out.println("ASCO ");
    }
}
