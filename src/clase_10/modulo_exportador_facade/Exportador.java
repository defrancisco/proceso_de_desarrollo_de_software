package clase_10.modulo_exportador_facade;

import clase_10.modulo_exportador_facade.strategy.IEstrategiaDeExportacion;

public class Exportador {
    private IEstrategiaDeExportacion estrategia;
    private IExportable documentoAExportar;

    public Exportador(IEstrategiaDeExportacion estrategia, IExportable documentoAExportar) {
        this.estrategia = estrategia;
        this.documentoAExportar = documentoAExportar;
    }

    public String exportar() {
        if (this.estrategia == null || this.documentoAExportar == null) {
            throw new IllegalStateException("Falta configurar la estrategia o el documento.");
        }
        return estrategia.exportar(documentoAExportar);
    }

    public void cambiarEstrategia(IEstrategiaDeExportacion estrategia_nueva) {
        this.estrategia = estrategia_nueva;
    }

    public void setExportable(IExportable doc) {
        this.documentoAExportar = doc;
    }
}
