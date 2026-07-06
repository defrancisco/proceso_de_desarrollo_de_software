package clase_8.Modulo_App_Meteorologica.observadores;

import clase_8.Modulo_App_Meteorologica.iObserver;

public class AppdeUsuario implements iObserver {
    @Override
    public void actualizarClima(double temperatura, double humedad) {
        System.out.println("[NOTIFICACION APP] Actualizando interfaz: Temperatura: "+ temperatura+" °C " +" | Humedad: " + humedad + ".");
    }

    @Override
    public void actualizarPresionAtmosferica(double presion) {
        System.out.println("[NOTIFICACION APP] Actualizando interfaz: Presion atmosferica " + presion);
    }
}
