package clase_7.Modulo_ATM.estados;

import clase_7.Modulo_ATM.ATMContext;
import clase_7.Modulo_ATM.EstadosATM;

public class SinTarjeta implements EstadosATM {
    private ATMContext atm;

    public SinTarjeta(ATMContext atm) {
        this.atm = atm;
    }


    @Override
    public void insertarTarjeta() {
        System.out.println("Tarjeta aceptada. Ingrese su PIN: ");
        atm.setEstados(new EsperandoPin(atm));

    }

    @Override
    public void ingresarPin(int pin) {
        System.out.println("[ERROR] Debe ingresar su tarjeta primero. ");
    }

    @Override
    public void retirarDinero(int monto) {
        System.out.println("[ERROR] Debe ingresar su tarjeta primero. ");
    }
}
