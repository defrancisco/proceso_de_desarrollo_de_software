package clase_11.simulacro_segundo_parcial.ejercicio1.decorator;

import clase_11.simulacro_segundo_parcial.ejercicio1.iPaquete;



public abstract class DecoradorPaquetes implements iPaquete {
    protected iPaquete carga;

    public DecoradorPaquetes(iPaquete carga) {
        this.carga = carga;
    }


    public double getPeso() {
        return carga.getPeso();
    }

    @Override
    public double getCosto() {
        return carga.getCosto();
    }
}
