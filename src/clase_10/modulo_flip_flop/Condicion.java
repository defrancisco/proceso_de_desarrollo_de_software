package clase_10.modulo_flip_flop;


public class Condicion {
    private double umbralInferior;
    private double umbralSuperior; 

    public Condicion(double umbralInferior, double umbralSuperior) {
        this.umbralInferior = umbralInferior;
        this.umbralSuperior = umbralSuperior;
    }

    public boolean cumple(double resultado) {
        return resultado >= umbralInferior && resultado < umbralSuperior;
    }
}