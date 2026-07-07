package segundo_parcial_resolucion.ejercicio1;

public class Camion implements Transporte {

    @Override
    public void deliver(String destino) {
        System.out.println("Enviando por camión a " + destino);
    }
}