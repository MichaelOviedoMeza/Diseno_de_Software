/*
 * Diseño de Software
 * Laboratorio 3 - Patrón State
 * Michael Joseph Oviedo Meza
 * Carné: 2021022451
 */

package cr.ac.ucr.state;

public interface EstadoPedido {

    void agregarProducto(Pedido pedido, String producto);

    void cancelarPedido(Pedido pedido);

    void despachar(Pedido pedido);
}