package clase_9.Patron_Singleton.Modulo_ConfigurationManager;


import clase_8.GarbariSI.Strategy.ImpuestoAplicable;

import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    // 1. Atributo estático privado que guardará la única instancia de la clase
    private static ConfigurationManager instance; // única instancia
    private Map<String, String> configData;

    // 3. Método estático público para obtener la única instancia
    public static ConfigurationManager getInstance() {
        if (instance == null) {
            instance = new ConfigurationManager();
        }
        return instance;
    }

    // 2. Constructor PRIVADO. Evita que se use "new ConfigurationManager()" desde fuera
    private ConfigurationManager(){
        configData = new HashMap<>();
        configData.put("idioma", "es");
        configData.put("puerto", "8080");
        configData.put("db_url", "jdbc:mysql://localhost:3306/app");
    }

    // Métodos de negocio (operaciones normales del objeto)
    public String getConfigValue(String key){
        return configData.get(key);
    }

    public void setConfigValue(String key, String value){
        configData.put(key, value);
    }
}
