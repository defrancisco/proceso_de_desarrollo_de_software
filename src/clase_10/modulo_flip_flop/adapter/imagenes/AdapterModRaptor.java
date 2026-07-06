package clase_10.modulo_flip_flop.adapter.imagenes;


import clase_10.modulo_flip_flop.Imagen;

// Simula la llamada a la API externa de Modraptor
public class AdapterModRaptor implements IAdapterModerarImagen {
    @Override
    public double moderarImagen(Imagen imagen) {
        System.out.println("-> Analizando imagen con la API de Modraptor...");
        // Simula el retorno aleatorio de una probabilidad entre 0.0 y 1.0
        return Math.random(); 
    }
}