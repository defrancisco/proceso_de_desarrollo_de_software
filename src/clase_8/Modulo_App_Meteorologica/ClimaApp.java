package clase_8.Modulo_App_Meteorologica;

import clase_8.Modulo_App_Meteorologica.observadores.AppdeUsuario;
import clase_8.Modulo_App_Meteorologica.observadores.CentraldeEmergencias;
import clase_8.Modulo_App_Meteorologica.observadores.ServiciodeEstadísticas;

public class ClimaApp {
    public static void main(String[] args) {
        EstacionMeteorológica estacionMeteorológica = new EstacionMeteorológica();


        AppdeUsuario appdeUsuario = new AppdeUsuario();
        CentraldeEmergencias centraldeEmergencias = new CentraldeEmergencias();
        ServiciodeEstadísticas serviciodeEstadísticas = new ServiciodeEstadísticas();


        estacionMeteorológica.agregarObservador(appdeUsuario);
        estacionMeteorológica.agregarObservador(centraldeEmergencias);
        estacionMeteorológica.agregarObservador(serviciodeEstadísticas);


        estacionMeteorológica.setMediciones(25.5, 60.0, 20);
        System.out.println("--------------");
        estacionMeteorológica.setMediciones(40.5, 90.0, 20);



        estacionMeteorológica.eliminarObservador(appdeUsuario);
        System.out.println("\n--- Después de desvincular la App ---");
        estacionMeteorológica.setMediciones(40.0, 90.0, 20);

    }
}
