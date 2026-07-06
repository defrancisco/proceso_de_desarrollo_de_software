package clase_9.Modulo_Exportador_nuevo;

import clase_9.Modulo_Exportador_nuevo.strategy.iEstrategiadeExportacion;


public class Exportador {
    private iEstrategiadeExportacion estrategia;
    private iExportable documentoAExportar;

    public Exportador(iEstrategiadeExportacion estrategia, iExportable documentoAExportar) {
        this.estrategia = estrategia;
        this.documentoAExportar = documentoAExportar;

    }

    public String exportar() {
        if (this.estrategia == null || this.documentoAExportar == null) {
            throw new IllegalStateException("Falta configurar la estrategia o el documento.");
        }
        return estrategia.exportar(documentoAExportar);
    }

    public void cambiarEstrategia(iEstrategiadeExportacion estrategia_nueva) {

        this.estrategia = estrategia_nueva;
    }

    public void setExportable(iExportable doc) {

        this.documentoAExportar = doc;
    }
}
