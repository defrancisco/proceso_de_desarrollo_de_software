package clase_7.Modulo_ATM;


import clase_7.Modulo_ATM.estados.SinTarjeta;

public class ATMContext implements EstadosATM  {
    // Esta sería mi clase Contexto
    private EstadosATM estadoActual; // ---- tengo mi variable de estado actual
    private int fondos = 10000; //saldo inicializado


    // constructor
    public ATMContext() {
        // estado inicial
        this.estadoActual = new SinTarjeta(this); // OJO LE PASAMOS EL CONTEXTO
    }

    // seteo desde el estado que tengo al próximo
    public void setEstados(EstadosATM nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }


    public int getFondos() {
        return fondos;
    }

    public void descontarFondos(int monto) {
        this.fondos -= monto;
    }


    //------------------------------- estados
    @Override
    public void insertarTarjeta() {
        estadoActual.insertarTarjeta();
    }

    @Override
    public void ingresarPin(int pin) {
        estadoActual.ingresarPin(pin);
    }

    @Override
    public void retirarDinero(int monto) {
        estadoActual.retirarDinero(monto);
    }
}
