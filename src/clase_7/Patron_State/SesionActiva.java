package clase_7.Patron_State;

public class SesionActiva implements  EstadoATM{
    private ATMContext atm;

    public SesionActiva(ATMContext atm) {
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
        if (monto <= atm.getFondos()) {
            System.out.println("Retirando $" + monto + ". Retire su dinero y su tarjeta.");
            atm.descontarFondos(monto);

            if (atm.getFondos() <= 0) {
                atm.setEstado(new SinEfectivo(atm));
            } else {
                atm.setEstado(new SinTarjeta(atm));
            }
        } else {
            System.out.println("Error: Fondos del cajero insuficientes.");
            atm.setEstado(new SinTarjeta(atm));
        }
    }
}
