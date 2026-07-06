package clase_10.modulo_flip_flop.adapter.textos;


import clase_10.modulo_flip_flop.Texto;

// Simula la llamada a la API externa de SightEngine
public class AdapterSightEngine implements IAdapterModerarTexto {
    @Override
    public double moderarTexto(Texto texto) {
        System.out.println("-> Analizando texto con la API de SightEngine...");
        return Math.random(); 
    }
}