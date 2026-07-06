package clase_9.Patron_Simple_Factory.Logistics;

public class Bicycle implements iTransporte {
    @Override
    public void enviar() {
        System.out.println("Bicycle enviando...");
    }
}
