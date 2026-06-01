package clase_8.patron_observer.App_Meteorologica;

public interface Observador {
    void actualizar(double temperatura, double humedad);
}
// hay un único sujeto si se quiere saber quien esta notificando
// si hay n sujeto aca debería saber quiene sta enviando esta información