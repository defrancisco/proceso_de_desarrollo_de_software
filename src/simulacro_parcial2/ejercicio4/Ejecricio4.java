package simulacro_parcial2.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Ejecricio4 {
    // --- PATRÓN OBSERVER ---
    public interface ObservadorTramite{
        void actualizar(TramiteGubernamental tramite);
    }

    // Observador concreto de ejemplo
    public class ModuloRentas implements ObservadorTramite{
        @Override
        public void actualizar(TramiteGubernamental tramite){
            System.out.println("Rentas: Registrando trámite aprobado.");
        }
    }

    // --- PATRÓN STATE ---
    public interface EstadoTramite{
        void procesar(TramiteGubernamental contexto);
    }

    public class EstadoAprobado implements EstadoTramite{
        @Override
        public void procesar(TramiteGubernamental contexto){
            System.out.println("El trámite ya se encuentra aprobado, no hay acciones pendientes.");
        }
    }

    public class EstadoIniciado implements EstadoTramite{
        @Override
        public void procesar(TramiteGubernamental contexto){
            System.out.println("Validando datos del trámite...");
            System.out.println("Datos válidos. Mutando a Aprobado.");

            // Transición de estado (State)
            contexto.setEstado(new EstadoAprobado());

            // Disparo del evento (Observer)
            contexto.notificarObservadores();
        }
    }

// --- CONTEXTO (El Trámite) ---

    public class TramiteGubernamental{
        private EstadoTramite estadoActual;
        private List<ObservadorTramite> observadores = new ArrayList<>();

        public TramiteGubernamental(){
            this.estadoActual = new EstadoIniciado(); // Estado por defecto
        }

        // Método para la transición de estados
        public void setEstado(EstadoTramite nuevoEstado){
            this.estadoActual = nuevoEstado;
        }

        // Delegación al State
        public void avanzarTramite(){
            this.estadoActual.procesar(this);
        }

        // Gestión del Observer (Alta, Baja y Notificación)
        public void suscribir(ObservadorTramite obs){
            this.observadores.add(obs);
        }

        public void desuscribir(ObservadorTramite obs){
            this.observadores.remove(obs);
        }

        public void notificarObservadores(){
            for (ObservadorTramite obs : observadores) {
                obs.actualizar(this); // Completamente polimórfico
            }
        }
    }
}
