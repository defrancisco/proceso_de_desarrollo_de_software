package clase_11.simulacro_segundo_parcial.ejercicio2;

public class Ejercicio2 {
    // Interfaz del Estado
    interface EstadoPedido {
        void procesarEnvio(PedidoContext contexto);
        void cancelar(PedidoContext contexto);
        void enViaje();
        void entregado();

    }
    // Clase Contexto
    public class PedidoContext {
        // paso el atributo de estados a privado
        private EstadoPedido estadoActual;
        private String codigoSeguridad;

        public PedidoContext(String codigo) {
            this.codigoSeguridad = codigo;
            this.estadoActual = new EstadoCreado();
        }
        public void ejecutarOperacion() { this.estadoActual.procesarEnvio(this); } // FALTABA COMPLETAR
        public void cancelarPedido() {this.estadoActual.cancelar(this); } // FALTABA COMPLETAR

        public void setEstado(EstadoPedido nuevoEstado) {
            this.estadoActual = nuevoEstado;
        }

        // Añado getter
        public String getCodigo() {
            return this.codigoSeguridad;
        }

    }
    // Estado Concreto
    class EstadoCreado implements EstadoPedido {
        Ejercicio2.PedidoContext contexto;
        @Override
        public void procesarEnvio(Ejercicio2.PedidoContext contexto) {
            System.out.println("Validando datos del pedido..." + contexto.getcCodigo());
        }
        @Override
        public void cancelar(PedidoContext contexto) {
            System.out.println("Pedido cancelado con éxito.");
            contexto.setEstado(new EstadoCancelado());
        }

        @Override
        public void enViaje() {

        }

        @Override
        public void entregado() {

        }


    }

    class EstadoEnViaje implements EstadoPedido {

        @Override
        public void procesarEnvio(PedidoContext contexto) {

        }

        @Override
        public void cancelar(PedidoContext contexto) {

        }

        @Override
        public void enViaje() {

        }

        @Override
        public void entregado() {

        }
    }
}
