package clase_6.Modulo_Cafeteria;

public class CafeSimple implements BebidaBase {

    @Override
    public String descripcion() {
        return "Cafe Simple";
    }

    @Override
    public double precio() {
        return 2000.00;
    }
}
