package clase_7.Modulo_ATM.estados;

import clase_7.Modulo_ATM.ATMContext;
import clase_7.Modulo_ATM.EstadosATM;


public class SinEfectivo implements EstadosATM {
    private ATMContext atm;

    public SinEfectivo(ATMContext atm) {
        this.atm = atm;
    }

    @Override
    public void insertarTarjeta() {
        System.out.println("[ERROR] Cajero fuera de servicio (sin efectivo).");
    }

    @Override
    public void ingresarPin(int pin) {
        System.out.println("[Cajero fuera de servicio..");
    }


    @Override
    public void retirarDinero(int monto) {
        System.out.println("Cajero fuera de servicio.");
    }
}
