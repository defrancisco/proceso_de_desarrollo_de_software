package clase_8.Modulo_App_Meteorologica;

import java.util.ArrayList;
import java.util.List;

public class EstacionMeteorológica implements iObservable {
        private List<iObserver> observadores;
        private double temperatura;
        private double humedad;
        private double presionAtmosferica;


        public EstacionMeteorológica() {
            this.observadores = new ArrayList<>();
        }

        public void setMediciones(double temperatura, double humedad,  double presionAtmosferica) {
            this.temperatura = temperatura;
            this.humedad = humedad;
            this.presionAtmosferica = presionAtmosferica;
            System.out.println("\n[ESTACIÓN] Nuevas mediciones: " + temperatura + "°C y " + humedad + "% humedad. | Presion Atmosférica de "+ presionAtmosferica +" .");
            notificar();
        }

        @Override
        public void agregarObservador(iObserver o) {
            observadores.add(o);
        }

        @Override
        public void eliminarObservador(iObserver o) {
            observadores.remove(o);
        }

        @Override
        public void notificar() {
            for (iObserver o : observadores) {
                o.actualizarClima(temperatura, humedad);
                o.actualizarPresionAtmosferica(presionAtmosferica);
            }
        }
}
