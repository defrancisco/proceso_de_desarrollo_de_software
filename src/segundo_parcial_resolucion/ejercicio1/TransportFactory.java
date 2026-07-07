package segundo_parcial_resolucion.ejercicio1;

public class TransportFactory {

    public static Transporte createTransport(String tipoTransporte){

        switch (tipoTransporte.toLowerCase()) {

            case "camion":
                return new Camion();

            case "nave":
                return new NaveEspacial();

            default:
                throw new IllegalArgumentException("Tipo de transporte inválido");
        }
    }
}