package clase_8.patron_observer.App_Meteorologica;

import java.util.ArrayList;
import java.util.List;

public class EstacionMeotologica implements Sujeto {
    private List<Observador> observadores;
    private double temperatura;
    private double humedad;


    public EstacionMeotologica(){
        this.observadores = new ArrayList<>();
    }

    @Override
    public void adjuntar(Observador o){
        observadores.add(o);
    }
    // te anotas o no a la lista de observadores

    @Override
    public void desvincular(Observador o){
        observadores.remove(o);
    }

    @Override
    public void notificar(){
        for(Observador o : observadores){
            o.actualizar(temperatura, humedad);
        }
    } // agarra todos los observadores de la lista y llama a actualizar

    /**
     * Metodo para simular la recepción de nuevos datos
     * **/
    public void setMediciones(double temperatura, double humedad){
        this.temperatura = temperatura;
        this.humedad = humedad;
        System.out.println("[ESTACIÓN] Nuevas mediciones: " + temperatura + " °C " + " - " + humedad);
        notificar();
    }
}
