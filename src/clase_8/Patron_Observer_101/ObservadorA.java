package clase_8.Patron_Observer_101;

public class ObservadorA implements iObserver {
    @Override
    public void actualizar(iObservable o) {
        System.out.println("Observador A");
    }
}
