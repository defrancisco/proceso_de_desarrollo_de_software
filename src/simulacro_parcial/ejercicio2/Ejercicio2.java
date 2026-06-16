package simulacro_parcial.ejercicio2;

public class Ejercicio2 {
    // Interfaz del Estado
    interface EstadoPedido {
        void procesarEnvio(PedidoContext contexto);
        void cancelar(PedidoContext contexto);
    }

    // Clase Contexto
    public class PedidoContext {
        private EstadoPedido estadoActual; // Cambiado a private
        private String codigoSeguridad;

        public PedidoContext(String codigo) {
            this.codigoSeguridad = codigo;
            this.estadoActual = new EstadoCreado(); // Estado inicial
        }

        public void ejecutarOperacion() { this.estadoActual.procesarEnvio(this); }
        public void cancelarPedido() { this.estadoActual.cancelar(this); }

        public void setEstado(EstadoPedido nuevoEstado) {
            this.estadoActual = nuevoEstado;
        }
    }

    // Estado Concreto

    class EstadoCreado implements EstadoPedido {
        @Override
        public void procesarEnvio(PedidoContext contexto) {
            System.out.println("Validando datos del pedido...");
            contexto.setEstado(new EstadoEnviado());
        }
        @Override
        public void cancelar(PedidoContext contexto) {
            System.out.println("Pedido cancelado con éxito.");
            contexto.setEstado(new EstadoCancelado());
        }
    }

    class EstadoEnviado implements EstadoPedido {
        @Override
        public void procesarEnvio(PedidoContext contexto) {
            System.out.println("Ya fue enviado");
        }
        @Override
        public void cancelar(PedidoContext contexto) {
            System.out.print("El pedido ya se ha enviado");
        }
    }

    class EstadoCancelado implements EstadoPedido {
        @Override
        public void procesarEnvio(PedidoContext contexto) {
            System.out.println("Esta cancelado el pedido");
        }
        @Override
        public void cancelar(PedidoContext contexto) {
            System.out.print("El pedido ya esta cancelado");
        }
    }
}
