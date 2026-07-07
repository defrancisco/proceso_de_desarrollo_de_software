package segundo_parcial_resolucion.ejercicio1;

public class SistemaDespacho {
    private static SistemaDespacho instancia = null;
    private String configuracionAgencia;

    private SistemaDespacho() {
        // Carga un archivo pesado de configuración interplanetaria
        this.configuracionAgencia = "Config-Alfa-2026";
    }

    public static SistemaDespacho getInstancia(){
        if(instancia == null){
            instancia = new SistemaDespacho();
        }
        return instancia;

    }

    public void procesarEnvio(String tipoTransporte, String destino) {
        // Se delega la creación polimórfica a una fábicra (Simple Factory o Factory Method)
        Transporte transporte = TransportFactory.createTransport(tipoTransporte);
        transporte.deliver(destino);

    }

}
