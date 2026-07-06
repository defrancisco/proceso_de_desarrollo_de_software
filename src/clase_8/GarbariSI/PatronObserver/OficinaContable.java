package clase_8.GarbariSI.PatronObserver;

import clase_8.GarbariSI.Producto;

public class OficinaContable implements Observer {
    // cada vez que se vende un producto, quiere registrar en sus
    //libros contables el valor de la venta ($). Esto hace que el proceso contable de toda
    //la empresa esté más automatizado que el proceso actual: hasta ahora Betty (se
    //conoce así a cada una de las jefas de esta oficina en las distintas sucursales) se volvía
    //loca registrando diariamente las ventas producidas.

    private double totalLibroDiario = 0;

    @Override
    public void update(Producto p){
        totalLibroDiario += p.precioFinal();
        System.out.println("[CONTABILIDAD] Precio final: " + totalLibroDiario);

    }

}
