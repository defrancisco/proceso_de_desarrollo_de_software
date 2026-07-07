package clase_10;

public class FacadeSimple {
    // 1. EL SUBSISTEMA (Las clases complejas que ya existen)
    class Documento {
        public Documento(String datos) {

        } /* ... */ }
    class Exportador { /* ... */ }
    class FactoryEstrategia { /* ... */ }

    // 2. LA FACHADA (Tu patrón)
    public class FachadaExportacion {

        // El método mágico, simple y limpio para el cliente
        public void exportarReporteRapido(String datos, String formato) {
            // La Fachada hace el trabajo sucio
            Documento doc = new Documento(datos);
            FactoryEstrategia factory = new FactoryEstrategia();

            Exportador exportador = new Exportador();
            //exportador.setEstrategia(factory.crearEstrategia(formato));

            //exportador.exportar(doc);
            System.out.println("Exportación finalizada con éxito.");
        }
    }

    // 3. EL CLIENTE (Main)
    public class Main {
        public void main(String[] args) {
            // ¡Mira qué limpio queda!
            FachadaExportacion cajero = new FachadaExportacion();
            cajero.exportarReporteRapido("Balance 2026", "PDF");
        }
    }
}
