package clase_8.patron_observer.GarbariSI;

import clase_8.patron_observer.GarbariSI.Strategy.ImpuestoAplicable;

import java.util.ArrayList;
import java.util.List;

public class TipoDeProducto {
    private String nombre;
    private List<ImpuestoAplicable> impuestos = new ArrayList<>();


    public void addImpuestoAplicable(ImpuestoAplicable i){ impuestos.add(i);}

    public double totalImpuestos(Producto p){
        return impuestos.stream().mapToDouble(i -> i.aplicarImpuesto(p)).sum();
    }


}
