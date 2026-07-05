package clase_5.Patron_Strategy_101;

public class Contexto {
    private Estrategia estrategia;

    public void actuar(){ // lo que hago es declarar una función y seteo la estrategia
        this.estrategia.ejecutar();
    }

    public void cambiarEstrategia(Estrategia estrategia){
        this.estrategia = estrategia;
    }
}
