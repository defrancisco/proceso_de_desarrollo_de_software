package clase_5.Patron_Adapter_101;

public class Cliente {
    private iAdapter adapter;

    // RECORDAR SETEAR EL ADAPTER EN EL CONTEXTO
    public void setAdapter(iAdapter adapter) {
        this.adapter = adapter;
    }

    public void ejecutar(){
        System.out.println("Ejecutando sesión de Cliente");
        this.adapter.operacion();
        System.out.println("Se ha cerrado la sesión.");
        System.out.println("------------------------------");
    }
}
