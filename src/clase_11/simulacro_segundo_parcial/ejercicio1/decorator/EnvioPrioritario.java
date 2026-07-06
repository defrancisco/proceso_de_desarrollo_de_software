package clase_11.simulacro_segundo_parcial.ejercicio1.decorator;

import clase_11.simulacro_segundo_parcial.ejercicio1.iPaquete;


public class EnvioPrioritario extends DecoradorPaquetes{


    public EnvioPrioritario(iPaquete carga) {
        super(carga);
    }

    @Override
    public double getCosto() {
       return super.getCosto()  + 1500.00;
    }
}
