package clase_8.GarbariSI.PatronObserver;

import clase_8.GarbariSI.Producto;

public class OficinaContable implements Observer {
    private double totalLibroDiario = 0;

    @Override
    public void update(Producto p){
        totalLibroDiario += p.precioFinal();
        System.out.println("[CONTABILIDAD] Precio final: " + totalLibroDiario);

    }

}
