package clase_8.GarbariSI.PatronObserver;

import clase_8.GarbariSI.Producto;

public class Deposito implements Observer {
    //  le interesa saber qué producto tiene que preparar para entregar al cliente
    //y actuar de una forma más rápida y eficiente.
    @Override
    public void update(Producto p){
        System.out.println("[DEPOSITO]: Preparando producto " + p.getNombre() + " para entrega.");
    }
}
