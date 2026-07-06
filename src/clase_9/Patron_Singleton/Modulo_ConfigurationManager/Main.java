package clase_9.Patron_Singleton.Modulo_ConfigurationManager;


public class Main {
    public static void main(String[] args) {
        System.out.println("=== Intentando obtener el Gestor de Configuración por primera vez ===");
        ConfigurationManager configModuloUsuarios = ConfigurationManager.getInstance();
        System.out.println("Host de BD en módulo usuarios: " + configModuloUsuarios.getConfigValue("db_host"));

        System.out.println("\n=== Intentando obtenerlo por segunda vez desde otro módulo ===");
        ConfigurationManager configModuloPagos = ConfigurationManager.getInstance();
        System.out.println("Host de BD en módulo pagos: " + configModuloPagos.getConfigValue("db_host"));

        // Demostración de consistencia: Modificamos el valor desde un "objeto"
        System.out.println("\n=== Modificando el puerto desde el módulo de pagos... ===");
        configModuloPagos.setConfigValue("db_port", "5432");

        // El cambio se refleja en el otro "objeto" porque cambian lo mismo en memoria
        System.out.println("Puerto de BD visto desde módulo usuarios: " + configModuloUsuarios.getConfigValue("db_port"));

        // Comprobación de identidad (Dirección de memoria)
        System.out.println("\n=== ¿Son exactamente la misma instancia en memoria? ===");
        if (configModuloUsuarios == configModuloPagos) {
            System.out.println("¡SÍ! Ambas variables apuntan a la misma dirección de memoria: " + configModuloUsuarios);
        }
    }
}
