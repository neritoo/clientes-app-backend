package com.gavilan.springbootbackendapirest.models.services;

import com.gavilan.springbootbackendapirest.models.entity.Cliente;
import com.gavilan.springbootbackendapirest.models.entity.Factura;
import com.gavilan.springbootbackendapirest.models.entity.Producto;
import com.gavilan.springbootbackendapirest.models.entity.Region;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();

    public Page<Cliente> findAll(Pageable pageable);

    public Cliente save(Cliente cliente);

    public void delete(Long id);

    public Cliente findById(Long id);

    public List<Region> findAllRegiones();

    public Factura findFacturaById(Long id);

    public Factura saveFactura(Factura factura);

    public void deleteFacturaById(Long id);

    public List<Producto> findProductoByNombre(String termino);
}
