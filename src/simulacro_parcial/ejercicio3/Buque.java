package simulacro_parcial.ejercicio3;

public class Buque implements Observador {
    @Override
    public void actualizar(float marea) {
        System.out.println("actualizado " + marea);
    }
}
