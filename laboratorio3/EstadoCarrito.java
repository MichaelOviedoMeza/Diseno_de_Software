/*
 * Diseño de Software
 * Laboratorio 3 - Patrón State
 * Michael Joseph Oviedo Meza
 * Carné: 2021022451
 */

package cr.ac.ucr.state;

public class EstadoCarrito implements EstadoPedido {

    @Override
    public void agregarProducto(Pedido pedido, String producto) {

        pedido.getProductos().add(producto);

        System.out.println(
                "Producto agregado: " + producto);
    }

    @Override
    public void cancelarPedido(Pedido pedido) {

        System.out.println(
                "Pedido cancelado desde el estado Carrito.");
    }

    @Override
    public void despachar(Pedido pedido) {

        System.out.println(
                "No se puede despachar. Primero debe pagarse.");
    }
}