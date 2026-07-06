package clase_10.modulo_flip_flop.strategy;


import clase_10.modulo_flip_flop.Moderable;

// El Contexto del patrón Strategy
public class Moderador {
    private Moderable moderable;
    private EstrategiaModeracion estrategia;

    public void cambiarEstrategia(EstrategiaModeracion nuevaEstrategia) {
        this.estrategia = nuevaEstrategia;
    }

    public void moderar(Moderable moderable) {
        if (estrategia != null) {
            estrategia.moderar(moderable);
        } else {
            System.out.println("No hay ninguna estrategia de moderación configurada.");
        }
    }
}