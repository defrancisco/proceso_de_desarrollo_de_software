package clase_8.Modulo_App_Meteorologica.observadores;


import clase_8.Modulo_App_Meteorologica.iObserver;


public class ServiciodeEstadísticas implements iObserver {
    @Override
    public void actualizarClima(double temperatura, double humedad) {
        System.out.println("[NOTIFICACION SERVICIODEESTADISTICA] Temperatura: "+ temperatura+" °C " +" | Humedad: " + humedad + ".");
    }

    @Override
    public void actualizarPresionAtmosferica(double presion) {
        System.out.println("[NOTIFICACION SERVICIODEESTADISTICA] Presion atmosferica " + presion);
    }
}
