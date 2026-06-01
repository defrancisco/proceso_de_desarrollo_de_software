package clase_8.patron_observer.App_Meteorologica;

public interface Sujeto {
    void adjuntar(Observador o);
    void desvincular(Observador o);
    void notificar();
}
// Estos son los tres métodos de quien notifica