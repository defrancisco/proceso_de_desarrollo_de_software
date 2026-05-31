package clase_6.modulo_de_Stock_y_Precios;

import java.util.ArrayList;
import java.util.List;

public class Combo  implements clase_6.modulo_de_Stock_y_Precios.Vendible {
    private String nombreCombo;
    private List<clase_6.modulo_de_Stock_y_Precios.Vendible> items;

    public Combo(String nombreCombo){
        this.nombreCombo = nombreCombo;
        this.items = new ArrayList<clase_6.modulo_de_Stock_y_Precios.Vendible>();
    }

    public void agregarItem(clase_6.modulo_de_Stock_y_Precios.Vendible item){
        this.items.add(item);
    }

    public void eliminarItem(clase_6.modulo_de_Stock_y_Precios.Vendible item){
        this.items.remove(item);
    }

    @Override
    public String getDescripcion() {
        // iterate through a collection or list from the first element to the last
        StringBuilder sb = new StringBuilder(nombreCombo + " (Combo formado por: ");
        for (int i = 0; i<this.items.size(); i++){
            sb.append(items.get(i).getDescripcion());
            if ( i < items.size()-1){
                sb.append(", ");
            } //
        }
        sb.append(")");
        return sb.toString();
    }

    @Override
    public double getPrecio() {
        // El precio del combo es la suma de los productos que contiene
        // .stream(): Converts your collection into a stream, allowing you to process a sequence of elements declaratively.
        // .mapToDouble(Vendible::getPrecio): Transforms the stream of objects into a DoubleStream using the getPrecio() method reference.
        // .sum(): A terminal operation that adds all the extracted double values together and returns the final tota
       return items.stream().
               mapToDouble(clase_6.modulo_de_Stock_y_Precios.Vendible::getPrecio).
               sum();
    }


    @Override
    public int getStock() {
        // Lógica de negocio para Stock de Combos:
        // El stock de un combo está determinado por el componente que tenga MENOR stock disponible.
        // Si tenes 10 guantes y 2 cascos, solo puedes armar 2 combos.
        if (items.isEmpty()) return 0;
        return items.stream()
                .mapToInt(clase_6.modulo_de_Stock_y_Precios.Vendible::getStock)
                .min()
                .orElse(0);
    }

}
