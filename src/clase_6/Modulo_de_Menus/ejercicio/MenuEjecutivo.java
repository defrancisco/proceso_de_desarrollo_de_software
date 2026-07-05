package clase_6.Modulo_de_Menus.ejercicio;

import java.util.ArrayList;
import java.util.List;

public class MenuEjecutivo implements ItemMenu {
    private List<ItemMenu> menu;
    private String nombre;

    public MenuEjecutivo(String nombre) {
        this.nombre = nombre;
        this.menu = new ArrayList<>();
    }

    @Override
    public String nombre() {
        return menu.toString();
    }

    @Override
    public double precio(boolean dia) {
        double total = 0;

        // 1. Sumamos el precio de todos los ítems que contiene el menú
        for (ItemMenu item : menu) {
            total += item.precio(dia);
        }

        // 2. Aplicamos el 10% de descuento al total acumulado
        return (float) (total * 0.90);
    }

    public void agregar(ItemMenu plato) {
        this.menu.add(plato);
    }

    public void eliminar(ItemMenu plato) {
        this.menu.remove(plato);
    }
}
