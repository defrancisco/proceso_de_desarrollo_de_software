package clase_10.modulo_flip_flop;

public class Main {
    public static void main(String[] args) {
        // Instanciamos el Facade
        ModeracionFacade moduloFlipFlop = new ModeracionFacade();

        // Caso de simulación 1: El usuario sube un post completo (texto + foto) 
        String postTexto = "Me encanta salir a correr por las mañanas! #Saludable";
        String postFotoUrl = "https://cdn.flipflop.app/user1024/foto.jpg";

        System.out.println("Simulación: Un usuario publica contenido en la red social...");
        moduloFlipFlop.procesarPublicacion(postTexto, postFotoUrl);
    }
}