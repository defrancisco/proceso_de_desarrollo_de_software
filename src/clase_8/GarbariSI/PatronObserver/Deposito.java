package clase_8.GarbariSI.PatronObserver;

import clase_8.GarbariSI.Producto;

public class Deposito implements Observer {
    @Override
    public void update(Producto p){
        System.out.println("[DEPOSITO]: Preparando producto " + p.getNombre() + " para entrega.");
    }
}
