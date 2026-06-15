package clase_6.Patron_Composite;

public class Main {
    public static void main(String[] args) {

        Circulo c1 = new Circulo();
        Circulo c2 = new Circulo();

        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();

        Cuadrado cu1 = new Cuadrado();
        Cuadrado cu2 = new Cuadrado();

        GrupoDeImagenes grupo = new GrupoDeImagenes();
        GrupoDeImagenes grupo2 = new GrupoDeImagenes();
        GrupoDeImagenes grupo3 = new GrupoDeImagenes();


        grupo.agregar(c1);
        grupo.agregar(c2);


        grupo2.agregar(cu1);
        grupo2.agregar(cu2);

        grupo3.agregar(t1);
        grupo3.agregar(t2);

        grupo.print();
        grupo2.print();
        grupo3.print();




    }
}
