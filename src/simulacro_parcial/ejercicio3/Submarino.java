package simulacro_parcial.ejercicio3;

public class Submarino implements Observador {

    @Override
    public void actualizar(float marea) {
        System.out.println("Submarino actualizado" + marea);
    }
}
