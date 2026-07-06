package clase_7.Modulo_ATM;

public class Cajero {
    public static void main(String[] args) {
        ATMContext cajero = new ATMContext();

        cajero.retirarDinero(500);

        // Flujo normal
        cajero.insertarTarjeta();
        cajero.ingresarPin(1234);
        cajero.retirarDinero(2000);


        cajero.insertarTarjeta();
        cajero.ingresarPin(1234);
        cajero.retirarDinero(8000);


        cajero.insertarTarjeta();
    }
}
