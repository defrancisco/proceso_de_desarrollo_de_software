package clase_5.Patron_Adapter_101;

import clase_5.Patron_Adapter_101.adaptadas_metodosdistintos.AdaptadaC;

public class AdapterConcretoC implements iAdapter{
    private AdaptadaC adaptada;

    public AdapterConcretoC(AdaptadaC adaptada) {
        this.adaptada = adaptada;
    }

    @Override
    public void operacion() {
        this.adaptada.operacionReal();
    }
}
