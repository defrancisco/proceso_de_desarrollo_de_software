package clase_5.Patron_Strategy_101;

public class Main {
     public static void main(String[] args) {


        Contexto sistema = new Contexto();
        System.out.println("Iniciando el programa...");

        sistema.cambiarEstrategia(new EstrategiaConcretaA());
        sistema.actuar();

        sistema.cambiarEstrategia(new EstrategiaConcretaB());
        sistema.actuar();

        sistema.cambiarEstrategia(new EstrategiaConcretaC());
        sistema.actuar();

        sistema.cambiarEstrategia(new EstrategiaConcretaA());
        sistema.actuar();
        System.out.println("Terminando el programa...");




    }
}
