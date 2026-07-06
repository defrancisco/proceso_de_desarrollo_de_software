package clase_10.modulo_exportador_facade;

import clase_10.modulo_exportador_facade.strategy.IEstrategiaDeExportacion;

import java.util.List;
import java.util.Map;

/**
 * Clase Fachada que simplifica el uso del módulo exportador.
 */
public class ExportadorFacade {

    /**
     * Método simplificado para el cliente. Oculta la creación del documento,
     * el uso de la fábrica y la configuración del contexto del exportador.
     */
    public String exportarDocumento(Map<String, List<String>> datosTabulares, 
                                    FormatoDeExportacion formato, 
                                    String nombreArchivo) {
        
        // 1. Oculta la creación del documento (IExportable)
        IExportable documento = new Documento(datosTabulares);
        
        // 2. Oculta la interacción con la Fábrica de estrategias
        IEstrategiaDeExportacion estrategia = FactoryEstrategiaDeExportacion
                .crearEstrategia(formato, nombreArchivo);
        
        // 3. Oculta la configuración del "Contexto" (El Exportador)
        Exportador exportador = new Exportador(estrategia,documento);
        
        // 4. Ejecuta la acción compleja y retorna el resultado (ej. la ruta del archivo o mensaje)
        return exportador.exportar();
    }
}
