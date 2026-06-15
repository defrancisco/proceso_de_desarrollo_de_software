package clase_8.GarbariSI;

public class Producto {
    private String nombre;
    private double precioBase;
    private TipoDeProducto tipo;

    public Producto(String nombre, double precioBase, TipoDeProducto tipo){
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.tipo = tipo;
    }

    public String getNombre() {return nombre;}

    public double getPrecioBase() { return precioBase;}

    public double precioFinal(){
        return precioBase + tipo.totalImpuestos(this);
    }
    /*no entendi el this */
}
