package clase_7.Modulo_ATM.estados;

import clase_7.Modulo_ATM.ATMContext;
import clase_7.Modulo_ATM.EstadosATM;

public class EsperandoPin implements EstadosATM {
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
        if(pin == 1234){
            System.out.println("PIN Correcto.");
            atm.setEstados(new SesionActiva(atm));
        }else{
            System.out.println("[ERROR] Pin incorrecto. Tarjeta retirada por seguridad. ");
            atm.setEstados(new SinTarjeta(atm)); // vuelve hacia atras
        }
    }

    @Override
    public void retirarDinero(int monto) {
        System.out.println("[ERROR] Debe ingresar su PIN primero. ");
    }
}
