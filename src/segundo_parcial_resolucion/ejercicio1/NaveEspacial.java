package segundo_parcial_resolucion.ejercicio1;

public class NaveEspacial implements Transporte {

    @Override
    public void deliver(String destino) {
        System.out.println("Enviando por nave espacial a " + destino);
    }
}