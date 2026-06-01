package clase_8.patron_observer.GarbariSI.PatronObserver;

import clase_8.patron_observer.GarbariSI.Producto;

import java.util.Observable;

public interface Observer {
    void update(Producto p);
}
