/*
 * Diseño de Software
 * Laboratorio 3 - Patrón State
 * Michael Joseph Oviedo Meza
 * Carné: 2021022451
 */

package cr.ac.ucr.state;

public class EstadoEnviado implements EstadoPedido {

    @Override
    public void agregarProducto(Pedido pedido, String producto) {

        System.out.println(
                "No se pueden agregar productos. Pedido enviado.");
    }

    @Override
    public void cancelarPedido(Pedido pedido) {

        System.out.println(
                "No se puede cancelar porque el pedido ya fue enviado.");
    }

    @Override
    public void despachar(Pedido pedido) {

        System.out.println(
                "Pedido entregado.");

        pedido.setEstado(new EstadoEntregado());
    }
}