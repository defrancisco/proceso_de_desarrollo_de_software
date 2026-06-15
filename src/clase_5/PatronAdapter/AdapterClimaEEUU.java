package clase_5.PatronAdapter;

public class AdapterClimaEEUU implements MedidorTemperatura {

    private APIClimaEUU apiNorteamericano;

    public AdapterClimaEEUU(APIClimaEUU apiNorteamericano) {
        this.apiNorteamericano = apiNorteamericano;
    }

    @Override
    public double obtenerTemperaturaCelsius() {
        // 1. saco el dato incompatible
        double tempFarenheit = apiNorteamericano.getTemperaturaFarenheit();

        // 2. lo traducimos
        double tempCelsius = tempFarenheit - 273.15;

        return tempCelsius;
    }
}
