package clase_6.Patron_Composite;

import java.util.ArrayList;
import java.util.List;

public class GrupoDeImagenes implements Grafico {
    private List<Grafico> hijos = new ArrayList<>();

    public void print() {
        System.out.println("---Grupo de imagenes---");

        for(Grafico grafico : hijos){
            grafico.print();
        }
    }

    public void agregar(Grafico grafico){
        this.hijos.add(grafico);
    }

    public void eliminar(Grafico grafico){
        this.hijos.remove(grafico);
    }
}
