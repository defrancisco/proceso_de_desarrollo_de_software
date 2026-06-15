package clase_5.PatronStrategy.metodosdepago;

import clase_5.PatronStrategy.EstrategiadePagos;

public class Efectivo implements EstrategiadePagos {
    @Override
    public void procesarPago(double monto) {
        System.out.println("Efectivo:" + monto);
    }
}
