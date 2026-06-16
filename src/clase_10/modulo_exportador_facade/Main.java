package clase_10.modulo_exportador_facade;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        // 1. Armar los datos simulados de la tabla (según el KEY -> VALOR del enunciado)
        Map<String, List<String>> tablaDatos = new HashMap<>();
        tablaDatos.put("0", Arrays.asList("LU", "Nombre", "Apellido", "DNI"));
        tablaDatos.put("1", Arrays.asList("1015214", "N1", "A1", "22333444"));

        ExportadorFacade exportador = new ExportadorFacade();
        String resultado = exportador.exportarDocumento(tablaDatos, FormatoDeExportacion.PDF, "alumnos_reporte");

        System.out.println(resultado);
    }
}


