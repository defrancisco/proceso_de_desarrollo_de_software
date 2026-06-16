package clase_10.modulo_flip_flop;


public class EnviarRevisionManual implements Accionable {
    @Override
    public void ejecutar(Moderable moderable) {
        System.out.println("[Web Admin] ¡ALERTA! El contenido se envió al panel de moderación manual por dudas en el umbral.");
    }
}