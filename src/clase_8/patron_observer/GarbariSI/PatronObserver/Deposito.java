package clase_8.patron_observer.GarbariSI.PatronObserver;

import clase_8.patron_observer.GarbariSI.Producto;

public class Deposito implements Observer {
    @Override
    public void update(Producto p){
        System.out.println("[DEPOSITO]: Preparando producto " + p.getNombre() + " para entrega.");
    }
}
