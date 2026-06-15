package clase_9.singleton;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    
    // 1. Atributo estático privado que guardará la única instancia de la clase
    private static ConfigurationManager instance;
    
    // Simulación de los datos de configuración
    private Map<String, String> configData;

    // 2. Constructor PRIVADO. Evita que se use "new ConfigurationManager()" desde fuera
    private ConfigurationManager() {
        System.out.println("-> Cargando configuración por primera vez (Simulación de lectura de archivo)...");
        configData = new HashMap<>();
        // Valores por defecto
        configData.put("db_host", "localhost");
        configData.put("db_port", "3306");
        configData.put("theme", "dark");
    }

    // 3. Método estático público para obtener la única instancia
    public static ConfigurationManager getInstance() {
        // Si no se ha creado la instancia, la crea. Si ya existe, se salta el if.
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // Métodos de negocio (operaciones normales del objeto)
    public String getValue(String key) {
        return configData.get(key);
    }

    public void setValue(String key, String value) {
        configData.put(key, value);
    }
}
