package clase_6.Patron_Decorator_101;

public abstract class DecoradorClaseAbstracta implements Componente{
    //IMPORTANTE EL DECORADOR ES ABSTRACTO Y DECLARO EL DECORADOR COMO PROTECTED

    protected Componente componente;

    public DecoradorClaseAbstracta(Componente componente) {
        this.componente = componente;
    }

    @Override
    public void operacion() {
        componente.operacion();
    }


}
