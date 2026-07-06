package clase_7.Patron_State_101;

import clase_7.Patron_State_101.estados.EstadoConcretoA;
import clase_7.Patron_State_101.estados.EstadoConcretoB;

public class Contexto {
    private Estado estado;


    public Contexto(){
        this.estado = new EstadoConcretoA();

    }

    public void actuar(){
        this.estado.actuar(this);
    }

    public void cambiarEstado(EstadoConcretoB estado){
        this.estado = estado;
    }
}
