/*
 * Diseño de Software
 * Laboratorio 3 - Patrón State
 * Michael Joseph Oviedo Meza
 * Carné: 2021022451
 */

package cr.ac.ucr.state;

public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        System.out.println(
                "===== ESTADO CARRITO =====");

        pedido.agregarProducto("Laptop");
        pedido.agregarProducto("Mouse");

        System.out.println();

        System.out.println(
                "===== ESTADO PAGADO =====");

        pedido.setEstado(new EstadoPagado());

        pedido.agregarProducto("Teclado");

        System.out.println();

        System.out.println(
                "===== CANCELACION DESDE PAGADO =====");

        pedido.cancelarPedido();

        pedido.agregarProducto("Monitor");

        System.out.println();

        System.out.println(
                "===== PAGO NUEVAMENTE =====");

        pedido.setEstado(new EstadoPagado());

        pedido.despachar();

        System.out.println();

        System.out.println(
                "===== ESTADO ENVIADO =====");

        pedido.cancelarPedido();

        pedido.agregarProducto("Audifonos");

        pedido.despachar();

        System.out.println();

        System.out.println(
                "===== ESTADO ENTREGADO =====");

        pedido.cancelarPedido();

        pedido.agregarProducto("Tablet");

        pedido.despachar();
    }
}