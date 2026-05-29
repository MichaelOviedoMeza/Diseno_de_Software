/*
 * Diseño de Software
 * Laboratorio 3 - Patrón State
 * Michael Joseph Oviedo Meza
 * Carné: 2021022451
 */

package cr.ac.ucr.state;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private EstadoPedido estado;
    private List<String> productos;

    public Pedido() {
        this.estado = new EstadoCarrito();
        this.productos = new ArrayList<>();
    }

    public void setEstado(EstadoPedido estado) {
        this.estado = estado;
    }

    public EstadoPedido getEstado() {
        return estado;
    }

    public List<String> getProductos() {
        return productos;
    }

    public void agregarProducto(String producto) {
        estado.agregarProducto(this, producto);
    }

    public void cancelarPedido() {
        estado.cancelarPedido(this);
    }

    public void despachar() {
        estado.despachar(this);
    }
}
