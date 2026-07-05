package clase_5.Patron_Adapter_101;

import clase_5.Patron_Adapter_101.adaptadas_metodosdistintos.AdaptadaA;

public class AdapterConcretoA implements iAdapter {
    private AdaptadaA adaptada;

    public AdapterConcretoA(AdaptadaA adaptada) {
        this.adaptada = adaptada;
    }

    @Override
    public void operacion() {
        this.adaptada.operacionRealA();
    }
}
