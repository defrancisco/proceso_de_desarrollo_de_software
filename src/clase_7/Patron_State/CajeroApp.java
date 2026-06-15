package clase_7.Patron_State;

public class CajeroApp {
    public static void main(String[] args) {
        ATMContext cajero = new ATMContext();

        // Intento fallido
        cajero.retirarDinero(500);

        // Flujo normal
        cajero.insertarTarjeta();
        cajero.ingresarPin(1234);
        cajero.retirarDinero(2000);

        // Simulación de cajero vacío
        cajero.insertarTarjeta();
        cajero.ingresarPin(1234);
        cajero.retirarDinero(8000); // Esto agotará los 10000 iniciales

        // Intento posterior
        cajero.insertarTarjeta();
        cajero.retirarDinero(8000);
    }
}
