package clase_7.Patron_State;

public class EsperandoPin implements EstadoATM {
    private ATMContext atm;

    public EsperandoPin(ATMContext atm) {
        this.atm = atm;
    }

    @Override
    public void insertarTarjeta() {
        System.out.println("[ERROR] Tarjeta ya insertada.");
    }

    @Override
    public void ingresarPin(int pin) {
        if (pin == 1234) {
            System.out.println("PIN Correcto.");
            atm.setEstado(new SesionActiva(atm));
        } else {
            System.out.println("PIN Incorrecto. Tarjeta retenida por seguridad.");
            atm.setEstado(new SinTarjeta(atm));
        }
    }

    @Override
    public void retirarDinero(int monto) {
        System.out.println("[ERROR] Operación no permitida sin PIN. ");
    }
}
