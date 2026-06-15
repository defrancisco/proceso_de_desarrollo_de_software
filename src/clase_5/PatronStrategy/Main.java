package clase_5.PatronStrategy;

import clase_5.PatronStrategy.metodosdepago.Efectivo;
import clase_5.PatronStrategy.metodosdepago.TarjetaDeCredito;

public class Main {
    public static void main(String[] args) {
        CajaRegistradora caja = new CajaRegistradora();

        // monto
        double totalCompra= 80000.00;


        // Método 1
        caja.setEstrategia(new TarjetaDeCredito());
        caja.cobrar(totalCompra);

        // Método 2
        caja.setEstrategia(new Efectivo());
        caja.cobrar(totalCompra);

    }
}
