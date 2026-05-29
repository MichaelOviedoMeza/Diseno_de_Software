/*
 * Diseño de Software
 * Laboratorio 3 - Patrón State
 * Michael Joseph Oviedo Meza
 * Carné: 2021022451
 */

package cr.ac.ucr.state;

public class EstadoPagado implements EstadoPedido {

    @Override
    public void agregarProducto(Pedido pedido, String producto) {

        System.out.println(
                "No se pueden agregar productos porque el pedido ya fue pagado.");
    }

    @Override
    public void cancelarPedido(Pedido pedido) {

        System.out.println(
                "Pedido cancelado y reembolsado.");

        pedido.setEstado(new EstadoCarrito());
    }

    @Override
    public void despachar(Pedido pedido) {

        System.out.println(
                "Pedido enviado.");

        pedido.setEstado(new EstadoEnviado());
    }
}