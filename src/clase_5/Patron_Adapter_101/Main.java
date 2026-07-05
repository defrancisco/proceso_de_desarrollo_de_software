package clase_5.Patron_Adapter_101;

import clase_5.Patron_Adapter_101.adaptadas_metodosdistintos.AdaptadaA;
import clase_5.Patron_Adapter_101.adaptadas_metodosdistintos.AdaptadaB;
import clase_5.Patron_Adapter_101.adaptadas_metodosdistintos.AdaptadaC;

public class Main {
    public static void main(String[] args) {

        System.out.println("Bienvenido al Adapter");
        System.out.println("------------------------------");
        Cliente cliente = new Cliente();

        iAdapter adapterA = new AdapterConcretoA(new  AdaptadaA());
        cliente.setAdapter(adapterA);
        cliente.ejecutar();

        iAdapter adapterB = new AdapterConcretoB(new  AdaptadaB());
        cliente.setAdapter(adapterB);
        cliente.ejecutar();

        iAdapter adapterC = new AdapterConcretoC(new AdaptadaC());
        cliente.setAdapter(adapterC);
        cliente.ejecutar();



    }
}
