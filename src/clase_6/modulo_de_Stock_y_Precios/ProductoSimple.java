package clase_6.modulo_de_Stock_y_Precios;



public class ProductoSimple  extends Producto {
    private Integer stock;
    private Double precio;

    public ProductoSimple(Integer stock, Double precio) {
        this.stock = stock;
        this.precio = precio;
    }

    public Double precio() {
        return this.precio;
    }

    public Integer stock() {
        return this.stock;
    }


    // Stock. getter y setter
    public Integer getStock() {
        return stock;
    }
    public void setStock(Integer stock) {
        this.stock = stock;
    }


    // Precio: getter y setter
    public Double getPrecio() {
        return precio;
    }
    public void setPrecio(Double precio) {
        this.precio = precio;
    }



}