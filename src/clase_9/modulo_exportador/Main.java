package clase_9.modulo_exportador;

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

        IExportable documento = new Documento(tablaDatos);

        // 2. Definir variables de ejecución (Simula la elección del usuario)
        FormatoDeExportacion formatoElegido = FormatoDeExportacion.EXCEL; 
        String nombreArchivo = "ReporteAlumnos";

        // 3. Utilizar la fábrica para obtener la estrategia correcta
        IEstrategiaDeExportacion estrategia = FactoryEstrategiaDeExportacion.crearEstrategia(formatoElegido, nombreArchivo);

        // 4. Configurar el Exportador y ejecutar
        Exportador exportador = new Exportador(estrategia, documento);
        String resultado = exportador.exportar();

        System.out.println(resultado);
    }
}
