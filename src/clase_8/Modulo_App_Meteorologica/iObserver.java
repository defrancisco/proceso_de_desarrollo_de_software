package clase_8.Modulo_App_Meteorologica;

public interface iObserver {
    void actualizarClima(double temperatura, double humedad);
    void actualizarPresionAtmosferica(double presion);
}
