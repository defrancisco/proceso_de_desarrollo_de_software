package clase;

import java.util.List;
import java.util.Map;

public class Documento implements IExportable {
    private Map<String, List<String>> datos;

    public Documento(Map<String, List<String>> datos) {
        this.datos = datos;
    }

    @Override
    public Map<String, List<String>> datos() {
        return this.datos;
    }
}
