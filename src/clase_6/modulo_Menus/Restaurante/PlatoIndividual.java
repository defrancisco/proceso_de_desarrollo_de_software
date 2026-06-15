package clase_6.modulo_Menus.Restaurante;

public class PlatoIndividual implements ItemMenu {
    private String nombre;
    private double precio;

    public PlatoIndividual(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String getNombre() {
        return this.nombre;
    }

    @Override
    public double getPrecio(boolean dia) {
        if(dia) {
            return this.precio;// Retorna el precio tal cual, sin descuentos

        }else {
            return precio*2;
        }


    }

}
