package com.gavilan.springbootbackendapirest.models.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "factura_detalles")
public class DetalleFactura implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer cantidad;
    @ManyToOne(fetch = FetchType.LAZY)
    private Producto producto;

    public DetalleFactura() {

    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Double calcularImporte(){
        return this.cantidad.doubleValue() * this.producto.getPrecio();
    }

    public Double getImporte(){
        return this.calcularImporte();
    }

    private static final long serialVersionUID = 1L;

}
