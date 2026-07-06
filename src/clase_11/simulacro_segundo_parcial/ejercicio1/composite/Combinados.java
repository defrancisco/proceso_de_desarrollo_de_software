package clase_11.simulacro_segundo_parcial.ejercicio1.composite;

import clase_11.simulacro_segundo_parcial.ejercicio1.iPaquete;

import java.util.ArrayList;
import java.util.List;

public class Combinados implements iPaquete {
    private List<iPaquete> paquetes = new ArrayList<iPaquete>();

    @Override
    public double getPeso() {
        return paquetes.stream().mapToDouble(iPaquete::getPeso).sum() ;
    }

    @Override
    public double getCosto() {
        return paquetes.stream().mapToDouble(iPaquete::getCosto).sum() ;
    }



    public void agregarPaquete(iPaquete paquete) {
        this.paquetes.add(paquete);
    }

    public void removePaquete(iPaquete paquete) {
        this.paquetes.remove(paquete);
    }

}
