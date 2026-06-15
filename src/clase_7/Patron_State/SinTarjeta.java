package clase_7.Patron_State;

public class SinTarjeta implements EstadoATM{
    private ATMContext atm;

    public SinTarjeta(ATMContext atm) {
        this.atm = atm;
    }

    @Override
    public void insertarTarjeta() {
        System.out.println("Tarjeta insertada. Ingrese su PIN: ");
        atm.setEstado(new EsperandoPin(atm));
    }

    @Override
    public void ingresarPin(int pin) {
        System.out.println("[ERROR] Inserte la tarjeta primero.");
    }

    @Override
    public void retirarDinero(int monto) {
        System.out.println("[ERROR] Operación no permitida sin tarjeta. ");
    }
}
