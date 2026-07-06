package clase_9.Modulo_Exportador_nuevo;

import java.util.List;
import java.util.Map;

public class Documento implements iExportable {
    private Map<String, List<String>> datos;

    public Documento(Map<String, List<String>> datos) {
        this.datos = datos;
    }


    @Override
    public Map<String, List<String>> datos() {
        return this.datos;
    }

}
