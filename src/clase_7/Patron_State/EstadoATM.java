package clase_7.Patron_State;

public interface EstadoATM {
     void insertarTarjeta();
     void ingresarPin(int pin);
     void retirarDinero(int monto);
}
