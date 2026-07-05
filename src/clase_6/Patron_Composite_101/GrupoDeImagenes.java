package clase_6.Patron_Composite_101;

import java.util.ArrayList;
import java.util.List;

public class GrupoDeImagenes implements Grafico {
    private List<Grafico> hojas = new ArrayList<>();

    @Override
    public void pintar() {
        System.out.println("----------------------");
        System.out.println("Grupo de imagenes:");

        for(Grafico grafico : hojas){
            grafico.pintar();
        }

        System.out.println("----------------------");
    }

    public void agregar(Grafico grafico){
        hojas.add(grafico);
    }

    public void eliminar(Grafico grafico){
        hojas.remove(grafico);
    }
}
