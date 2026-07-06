package clase_9.Patron_Simple_Factory.Patron_101.Productos;

import clase_9.Patron_Simple_Factory.Patron_101.iProducto;

public class ProductoA implements iProducto {

    @Override
    public void operacionEspecifica() {
      System.out.println("Producto A");
    }
}
