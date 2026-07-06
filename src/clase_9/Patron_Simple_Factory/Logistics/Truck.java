package clase_9.Patron_Simple_Factory.Logistics;

public class Truck implements iTransporte {
    @Override
    public void enviar() {
        System.out.println("Truck enviado");
    }
}
