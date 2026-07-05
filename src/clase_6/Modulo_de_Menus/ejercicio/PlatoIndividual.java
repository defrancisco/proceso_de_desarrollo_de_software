package clase_6.Modulo_de_Menus.ejercicio;

public class PlatoIndividual implements ItemMenu {
    private String nombre;
    private double precio;


    public PlatoIndividual(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String nombre() {
        return this.nombre;
    }

    @Override
    public double precio(boolean dia) {
        if(dia) {
            return this.precio;// Retorna el precio tal cual, sin descuentos

        }else {
            return precio*2;
        }
    }
}
