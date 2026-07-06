package clase_7.Patron_State_101.estados;

import clase_7.Patron_State_101.Contexto;
import clase_7.Patron_State_101.Estado;

public class EstadoConcretoB extends Estado {

    @Override
    public void actuar(Contexto contexto){
        if(this.cumpleCondicionParaCambiarDeEstado(contexto)){
            contexto.cambiarEstado(new EstadoConcretoB());
        }

    }

    private boolean cumpleCondicionParaCambiarDeEstado(Contexto contexto){
        return true;

    }
}
