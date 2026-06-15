package clase_7.Patron_State;

public class SinEfectivo implements EstadoATM{
    private ATMContext atm;

    public SinEfectivo(ATMContext atm) {
        this.atm = atm;
    }

    @Override
    public void insertarTarjeta() {
        System.out.println("[ERROR] Ya hay una sesión activa.");
    }

    @Override
    public void ingresarPin(int pin) {
        System.out.println("[ERROR] Ya está autenticado.");
    }


    @Override
    public void retirarDinero(int monto) {
        System.out.println("Cajero fuera de servicio.");
    }
}