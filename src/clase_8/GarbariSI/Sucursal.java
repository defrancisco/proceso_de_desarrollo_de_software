package clase_8.GarbariSI;

import clase_8.GarbariSI.PatronObserver.Observer;

import java.util.ArrayList;
import java.util.List;

public class Sucursal {
    private String nombre;
    private String direccion;
    private List<Producto> productos = new ArrayList<>();
    private List<Observer> observadores = new ArrayList<>();


    public void vender(Producto producto){
        // Al vender, notifico a los interesados
        notificar(producto);
    }

    public void attach(Observer observer){
        observadores.add(observer);
    }
    public void detach(Observer observer){

        observadores.remove(observer);
    }
    public void notificar(Producto p){
        for(Observer o : observadores){
            o.update(p);
        }
    }

}
