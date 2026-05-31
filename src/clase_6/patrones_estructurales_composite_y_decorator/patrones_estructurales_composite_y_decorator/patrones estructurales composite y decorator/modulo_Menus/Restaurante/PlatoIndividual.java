package clase_6.modulo_Menus.Restaurante;

public class PlatoIndividual implements clase_6.modulo_Menus.Restaurante.ItemMenu {
    private String nombre;
    private float precio;

    public PlatoIndividual(String nombre, float precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public double getPrecio() {
        return this.precio;// Retorna el precio tal cual, sin descuentos
    }

}
