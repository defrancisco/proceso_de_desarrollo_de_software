package clase_8.patron_observer.GarbariSI.PatronObserver;

import clase_8.patron_observer.GarbariSI.Producto;

public class OficinaContable implements Observer {
    private double totalLibroDiario = 0;

    @Override
    public void update(Producto p){
        totalLibroDiario += p.precioFinal();
        System.out.println("[CONTABILIDAD] Precio final: " + totalLibroDiario);

    }

}
