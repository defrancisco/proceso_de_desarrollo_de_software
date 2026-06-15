package clase_5.PatronStrategy.metodosdepago;

import clase_5.PatronStrategy.EstrategiadePagos;

public class PayPal implements EstrategiadePagos {


    @Override
    public void procesarPago(double monto) {

        System.out.println("PayPal: " + monto);
    }
}
