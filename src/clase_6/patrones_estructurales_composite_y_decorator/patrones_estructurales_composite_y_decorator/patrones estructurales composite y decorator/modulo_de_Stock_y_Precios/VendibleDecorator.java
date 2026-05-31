package clase_6.modulo_de_Stock_y_Precios;

public abstract class VendibleDecorator implements clase_6.modulo_de_Stock_y_Precios.Vendible {
    // Referencia al objeto que estamos envolviendo (puede ser un ProductoSimple, un Combo u otro Decorador)
    protected clase_6.modulo_de_Stock_y_Precios.Vendible vendibleEnvuelto; //

    public VendibleDecorator(clase_6.modulo_de_Stock_y_Precios.Vendible vendible) {
        this.vendibleEnvuelto = vendible;
    }

    @Override
    public String getDescripcion() {
        return vendibleEnvuelto.getDescripcion();
    }

    @Override
    public double getPrecio() {
        return vendibleEnvuelto.getPrecio();
    }

    @Override
    public int getStock() {
        return vendibleEnvuelto.getStock();
    }
}
