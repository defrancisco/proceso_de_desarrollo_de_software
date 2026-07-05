package clase_6.Patron_Composite_101;

import clase_6.Patron_Composite_101.hojas.Circulo;
import clase_6.Patron_Composite_101.hojas.Cuadrado;
import clase_6.Patron_Composite_101.hojas.Triangulo;

public class Main {
    public static void main(String[] args) {

     Circulo circulo1 = new Circulo();
     Circulo circulo2 = new Circulo();
     Cuadrado cuadrado1 = new Cuadrado();
     Cuadrado cuadrado2 = new Cuadrado();
     Triangulo triangulo1 = new Triangulo();
     Triangulo triangulo2 = new Triangulo();

     GrupoDeImagenes grupoDeImagenes1 = new GrupoDeImagenes();
     GrupoDeImagenes grupoDeImagenes2 = new GrupoDeImagenes();


     grupoDeImagenes1.agregar(circulo1);
     grupoDeImagenes1.agregar(cuadrado1);
     grupoDeImagenes1.agregar(triangulo1);
     grupoDeImagenes1.pintar();

     grupoDeImagenes2.agregar(circulo2);
     grupoDeImagenes2.agregar(cuadrado2);
     grupoDeImagenes2.pintar();




    }
}
