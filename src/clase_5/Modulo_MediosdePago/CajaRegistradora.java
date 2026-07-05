package clase_5.Modulo_MediosdePago;


// Esta clase es lo que llamamos el Contexto (el administrador que delega el trabajo, cumple la estructura)

public class CajaRegistradora {

    // 1. el método en privado
    private EstrategiadePagos estrategia;

    // 2. seteamos la estrategia
    public void setEstrategia(EstrategiadePagos estrategia) {
        this.estrategia = estrategia;
    }

    // 3. declaramos el método del contexto que utiliza la estrategia
    public void cobrar(double monto) {
        if (estrategia == null){
            System.out.println("[ERROR]: Seleccion el método de pago válido.");
            return;
        }
        // La caja no sabe como se paga, le pasa a la estrategi el método de pago y ya
        estrategia.procesarPago(monto);
    }


}
