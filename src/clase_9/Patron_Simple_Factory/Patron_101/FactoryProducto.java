package clase_9.Patron_Simple_Factory.Patron_101;

import clase_9.Patron_Simple_Factory.Patron_101.Productos.ProductoA;
import clase_9.Patron_Simple_Factory.Patron_101.Productos.ProductoB;

public class FactoryProducto {

    public static iProducto crearProducto(String condicion){
        iProducto instancia = null;
        switch(condicion){
            case "1": instancia = new ProductoA(); break;
            case "2": instancia = new ProductoB(); break;
            default: throw new RuntimeException("No existe dicho producto");
        }

        return instancia;
    }
}
