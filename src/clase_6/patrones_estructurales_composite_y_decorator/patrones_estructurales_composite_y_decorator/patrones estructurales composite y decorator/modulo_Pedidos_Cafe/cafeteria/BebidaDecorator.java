package clase_6.modulo_Pedidos_Cafe.cafeteria;

public abstract class BebidaDecorator implements clase_6.modulo_Pedidos_Cafe.cafeteria.Bebida {
    // Almacenamos polimórficamente la bebida que estamos decorando
    protected clase_6.modulo_Pedidos_Cafe.cafeteria.Bebida bebidaEnvuelta;

    public BebidaDecorator(clase_6.modulo_Pedidos_Cafe.cafeteria.Bebida bebida) {
        this.bebidaEnvuelta = bebida;
    }

    @Override
    public String getDescripcion() {
        // Por defecto, le pide la descripción a la bebida de adentro
        return bebidaEnvuelta.getDescripcion();
    }

    @Override
    public double getPrecio(){
        // Por defecto, le pide el precio a la bebida de adentro
        return bebidaEnvuelta.getPrecio();
    }
}
