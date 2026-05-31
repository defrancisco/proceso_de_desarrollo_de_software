package clase_6.modulo_de_Stock_y_Precios;

public class DescuentoDecorator extends clase_6.modulo_de_Stock_y_Precios.VendibleDecorator {
    /*Modifica el precio restándole un porcentaje asignado de manera dinámica.
       Al heredar de VendibleDecorator, puede aplicarse tanto a productos simples como a combos enteros.
    * */

    private double porcentajeDescuento;

    public DescuentoDecorator(clase_6.modulo_de_Stock_y_Precios.Vendible vendible, double porcentajeDescuento){
        super(vendible); // llamo al constructor de
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public String getDescripcion() {
        return  super.getDescripcion() + " con Descuento del " + porcentajeDescuento + "%";
    }

    @Override
    public double getPrecio() {
        // Delegamos el precio acumulado hasta el momento y le restamos el porcentaje
        double precioAnterior = super.getPrecio();

        return precioAnterior - (precioAnterior * (porcentajeDescuento/100));
    }

    // El stock no se altera por tener un descuento aplicándose, por lo que super.getStock() es suficiente
}
