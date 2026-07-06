package clase_8.Patron_Observer_101;

import java.util.ArrayList;
import java.util.List;

public class SujetoConcreto implements iObservable {
    private List<iObserver> observers;

    public SujetoConcreto() {
        this.observers = new ArrayList<iObserver>();
    }

    @Override
    public void notificar() {
        this.observers.forEach(o -> o.actualizar(this));
    }

    @Override
    public void agregar(iObserver o) {
        this.observers.add(o);
    }

    @Override
    public void eliminar(iObserver o) {
        this.observers.remove(o);
    }
}
