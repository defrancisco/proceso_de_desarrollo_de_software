package clase_7.Patron_State;

public class ATMContext {
    private EstadoATM estadoActual;
    private int fondos = 1000000;

    public ATMContext() {
        // Seteamos el estado incicial
        this.estadoActual = new SinTarjeta(this);
    }


    public void setEstado(EstadoATM estadoActual) {
        this.estadoActual = estadoActual;
    }

    public int getFondos() {
        return fondos;
    }
    public void descontarFondos(int monto) {
        this.fondos -= monto;
    }




    // Delegamos los métodos actuales al Patron State
    public void insertarTarjeta(){
        estadoActual.insertarTarjeta();
    }

    public void ingresarPin(int pin){
        estadoActual.ingresarPin(pin);
    }

    public void retirarDinero(int monto){
        estadoActual.retirarDinero(monto);
    }
}
