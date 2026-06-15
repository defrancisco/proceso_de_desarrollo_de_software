package clase_6.modulo_Menus.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class MenuPromocional implements clase_6.modulo_Menus.Restaurante.ItemMenu {
   private String nombre;
   private List<ItemMenu> items;

   public MenuPromocional(String nombre){
       this.nombre = nombre;
       this.items = new ArrayList<>();
   }

   @Override
   public String getNombre() {
       return this.nombre;
   }


   public void agregarItem(clase_6.modulo_Menus.Restaurante.ItemMenu plato){

       this.items.add(plato);
   }

   public void eliminarItem(clase_6.modulo_Menus.Restaurante.ItemMenu plato){

       this.items.remove(plato);
   }

   @Override
    public double getPrecio(boolean dia){
       double total = 0;

       // 1. Sumamos el precio de todos los ítems que contiene el menú
       for (ItemMenu item : items) {
           total += item.getPrecio(dia);
       }

       // 2. Aplicamos el 10% de descuento al total acumulado
       return (float) (total * 0.90);
   }

}
