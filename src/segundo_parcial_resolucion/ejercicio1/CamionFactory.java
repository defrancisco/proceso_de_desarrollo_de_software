package segundo_parcial_resolucion.ejercicio1;

public class CamionFactory extends TransportFactory {

    @Override
    public Transporte createTransport() {
        return new Camion();
    }
}