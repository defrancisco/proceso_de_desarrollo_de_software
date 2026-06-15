package clase_8.App_Meteorologica;

public class ClimaApp {
    public static void main(String[] args) {
        //Creamos el Sujeto
        /*
        * Es el objeto que mantiene el estado importante.
        * Tiene una lista de suscriptores y métodos para adjuntar (suscribir),
        * desadjuntar (desuscribir) y notificar a los observadores.*/

        EstacionMeotologica estacion = new EstacionMeotologica();

        //Creamos los Observadores
        /*Es una interfaz o clase abstracta que define el métod update()
                         que el Sujeto llamará para notificarle un cambio.
        * */
        AppUsuario appCelular = new AppUsuario();
        CentralEmergencias central = new CentralEmergencias();

        // Los subscribimos (pasamos del "1" al "*"
        estacion.adjuntar(appCelular);
        estacion.adjuntar(central);

        // Simulamos cambios en el clima
        estacion.setMediciones(23.7,80.0);

        // Simulamos de alerta
        estacion.setMediciones(51, 90);

        // Simulación de alerta
        estacion.adjuntar(central);

        System.out.println("-----Después de desvincular la App");
        estacion.setMediciones(30, 60);



    }
}
