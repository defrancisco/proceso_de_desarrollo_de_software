package clase_6.modulo_Menus.Restaurante;

import java.util.ArrayList;
import java.util.List;

public class MenuPromocional implements clase_6.modulo_Menus.Restaurante.ItemMenu {
   private String nombre;
   private List<clase_6.modulo_Menus.Restaurante.ItemMenu> plato;

   public MenuPromocional(String nombre){
       this.nombre = nombre;
       this.plato = new ArrayList<>();
   }

   @Override
   public String getNombre() {
       return this.nombre;
   }


   public void agregarPlato(clase_6.modulo_Menus.Restaurante.ItemMenu plato){
       this.plato.add(plato);
   }

   public void eliminarPlato(clase_6.modulo_Menus.Restaurante.ItemMenu plato){
       this.plato.remove(plato);
   }

   @Override
    public double getPrecio(){
       double total = 0;

       // 1. Sumamos el precio de todos los ítems que contiene el menú
       for (clase_6.modulo_Menus.Restaurante.ItemMenu item : plato) {
           total += item.getPrecio();
       }

       // 2. Aplicamos el 10% de descuento al total acumulado
       return (float) (total * 0.90);
   }

}
