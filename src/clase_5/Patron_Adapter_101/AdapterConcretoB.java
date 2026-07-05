package clase_5.Patron_Adapter_101;

import clase_5.Patron_Adapter_101.adaptadas_metodosdistintos.AdaptadaB;

public class AdapterConcretoB implements iAdapter {
    private AdaptadaB adaptada;

    public AdapterConcretoB(AdaptadaB adaptada) {
        this.adaptada = adaptada;
    }

    @Override
    public void operacion() {
        adaptada.operacionReal();
    }
}
