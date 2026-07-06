package clase_8.Modulo_App_Meteorologica.observadores;

import clase_8.Modulo_App_Meteorologica.iObserver;

public class CentraldeEmergencias implements iObserver {
    @Override
    public void actualizarClima(double temperatura, double humedad) {
        if(temperatura > 40.0){
            System.out.println("[ALERTA] ¡Peligro de ola de calor! Activando protocolos.");
        }else{
            System.out.println("[CENTRAL] Clima bajo control.");
        }
    }

    @Override
    public void actualizarPresionAtmosferica(double presion) {
        System.out.println("[NOTIFICACION CENTRALEMERGENCIAS] Presion atmosferica " + presion);
    }
}
