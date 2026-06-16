package clase_10.modulo_flip_flop;


import java.util.ArrayList;
import java.util.List;

public class ModerarTexto implements EstrategiaModeracion {
    private IAdapterModerarTexto adaptador;
    private List<EstadoModeracion> posiblesEstados;

    public ModerarTexto(IAdapterModerarTexto adaptador) {
        this.adaptador = adaptador;
        this.posiblesEstados = new ArrayList<>();
        inicializarEstados();
    }

    private void inicializarEstados() {
        // [cite: 38, 41]
        EstadoModeracion aprobado = new EstadoModeracion("APROBADO", new Condicion(0.0, 0.2));
        aprobado.agregarAccion(new EnviarPushNotification());

        // [cite: 39, 42]
        EstadoModeracion revision = new EstadoModeracion("ENVIADO A REVISIÓN", new Condicion(0.2, 0.8));
        revision.agregarAccion(new EnviarRevisionManual());

        // [cite: 40, 41]
        EstadoModeracion rechazado = new EstadoModeracion("RECHAZADO", new Condicion(0.8, 1.01));
        rechazado.agregarAccion(new EnviarPushNotification());

        posiblesEstados.add(aprobado);
        posiblesEstados.add(revision);
        posiblesEstados.add(rechazado);
    }

    @Override
    public void moderar(Moderable moderable) {
        if (moderable instanceof Texto) {
            double resultadoIA = adaptador.moderarTexto((Texto) moderable);
            System.out.println("Métricas de IA obtenidas: " + String.format("%.2f", resultadoIA)); // [cite: 25]
            
            for (EstadoModeracion estado : posiblesEstados) {
                if (estado.cumpleCondicion(resultadoIA)) {
                    estado.ejecutarAcciones(moderable);
                    break;
                }
            }
        }
    }
}