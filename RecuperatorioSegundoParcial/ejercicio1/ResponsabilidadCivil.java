package ejercicio1;


// Poliza base ---> Debería heredar de una interfaz inicial para heredar
public class ResponsabilidadCivil implements Poliza {
    private double primaBase = 5000;

    @Override
    public double calcularPrima() {
        return primaBase;
    }
    public String descripcion() {
        return "Responsabilidad Civil"; }


}

// Se crea UNA SUBCLASE POR CADA COMBINACION posible de coberturas:
// ----> lo primero que realizo es una eliminación de estas combinaciones ya que generan alto acoplamiento.
// APLICAMOS PATRON DECORATOR, ya que queremos envolver varias veces la poliza de vehículos (nuestro objeto)



