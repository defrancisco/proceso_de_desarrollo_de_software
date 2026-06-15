package clase;

// Simula la llamada a la API externa de SightEngine 
public class AdapterSightEngine implements IAdapterModerarTexto {
    @Override
    public double moderarTexto(Texto texto) {
        System.out.println("-> Analizando texto con la API de SightEngine...");
        return Math.random(); 
    }
}