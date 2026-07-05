package clase_5.Modulo_API_Climatica;

public class Main {
    public static void main(String[] args) {

        // instancio
        APIClimaEUU servicioExterno = new APIClimaEUU();


        MedidorTemperatura medidorAdaptado = new AdapterClimaEEUU(servicioExterno);

        System.out.println("Medidor Adaptado: " + medidorAdaptado.obtenerTemperaturaCelsius() + "°C");
    }
}
