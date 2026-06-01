package clase_8.patron_observer.App_Meteorologica;

// Observadore

public class AppUsuario implements Observador {
    @Override
    public void actualizar(double temperatura, double humedad) {
        System.out.println("[APP] Actualizando clima de temperatura" + temperatura + " °C.");
    }
}
