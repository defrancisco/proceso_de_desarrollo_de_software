package clase_10.modulo_flip_flop;


/**
 * Fachada unificada que simplifica el complejo motor interno de FlipFlop. 
 */
public class ModeracionFacade {
    private Moderador moderador;
    private IAdapterModerarImagen adapterImagen;
    private IAdapterModerarTexto adapterTexto;

    public ModeracionFacade() {
        this.moderador = new Moderador();
        // Inicializamos las APIs por defecto requeridas por el enunciado 
        this.adapterImagen = new AdapterModRaptor();
        this.adapterTexto = new AdapterSightEngine();
    }

    /**
     * Punto de entrada ultra simple para el controlador de la aplicación móvil. 
     */
    public void procesarPublicacion(String textoPublicacion, String urlImagenPublicacion) {
        System.out.println("======= INICIANDO FLUJO EN MÓDULO FACADE =======");
        
        // 1. Si la publicación incluye texto, la fachada orquesta la estrategia de texto
        if (textoPublicacion != null && !textoPublicacion.isEmpty()) {
            System.out.println("\n--- Procesando Componente de Texto ---");
            Texto texto = new Texto(textoPublicacion);
            EstrategiaModeracion estrategiaTexto = new ModerarTexto(this.adapterTexto);
            
            moderador.cambiarEstrategia(estrategiaTexto);
            moderador.moderar(texto);
        }

        // 2. Si la publicación incluye una imagen, la fachada conmuta a la estrategia de imágenes
        if (urlImagenPublicacion != null && !urlImagenPublicacion.isEmpty()) {
            System.out.println("\n--- Procesando Componente de Imagen ---");
            Imagen imagen = new Imagen(urlImagenPublicacion);
            EstrategiaModeracion estrategiaImagen = new ModerarImagen(this.adapterImagen);
            
            moderador.cambiarEstrategia(estrategiaImagen);
            moderador.moderar(imagen);
        }
        System.out.println("\n================================================");
    }
}