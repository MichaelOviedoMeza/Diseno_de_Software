/*
 * Diseño de Software
 * Laboratorio 3 - Patrón State
 * Michael Joseph Oviedo Meza
 * Carné: 2021022451
 */

package cr.ac.ucr.state;

public class EstadoEntregado implements EstadoPedido {

    @Override
    public void agregarProducto(Pedido pedido, String producto) {

        System.out.println(
                "Pedido entregado. No se permiten modificaciones.");
    }

    @Override
    public void cancelarPedido(Pedido pedido) {

        System.out.println(
                "No se puede cancelar un pedido entregado.");
    }

    @Override
    public void despachar(Pedido pedido) {

        System.out.println(
                "El pedido ya fue entregado.");
    }
}
