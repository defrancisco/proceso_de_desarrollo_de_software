package clase_5.Modulo_MediosdePago.metodosdepago;

import clase_5.Modulo_MediosdePago.EstrategiadePagos;

public class PayPal implements EstrategiadePagos {


    @Override
    public void procesarPago(double monto) {

        System.out.println("PayPal: " + monto);
    }
}
