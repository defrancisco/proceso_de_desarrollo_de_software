package clase_8.patron_observer.App_Meteorologica;


public class CentralEmergencias implements Observador {
    @Override
    public void actualizar(double temperatura, double humedad) {
        if (temperatura > 50.0) {
            System.out.println("[ALERTA] ¡Peligro de ola de calor! Activando protocolos-");
        } else {
            System.out.println("[CENTRAL] Clima bajo control.");
        }

    }
}
