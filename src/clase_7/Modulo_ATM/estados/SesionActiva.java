package clase_7.Modulo_ATM.estados;


import clase_7.Modulo_ATM.ATMContext;
import clase_7.Modulo_ATM.EstadosATM;

public class SesionActiva implements EstadosATM {
    private ATMContext atm;

    public SesionActiva(ATMContext atm) {
        this.atm = atm;
    }


    @Override
    public void insertarTarjeta() {
        System.out.println("[ERROR] Tarjeta ya insertada.");
    }

    @Override
    public void ingresarPin(int pin) {
        System.out.println("[ERROR] PIN ya insertado.");
    }

    @Override
    public void retirarDinero(int monto) {
        if (monto <= atm.getFondos()) {
            System.out.println("Retirando $ "+  monto + ". Retire su dinero y su tarjeta.");
            System.out.println("[CIERRE DE SESIÓN]");
            System.out.println("----------------------");
            atm.descontarFondos(monto);

            // si el monto es menor a 0
            if(atm.getFondos() <= 0) {
                atm.setEstados(new SinEfectivo(atm));
            } else{
                atm.setEstados(new SinTarjeta(atm));
            }

        }else{
            System.out.println("[ERROR] Fondos del cajero insuficientes.");
            atm.setEstados(new SinTarjeta(atm)); // vuelve a paso 1
        }
    }
}
