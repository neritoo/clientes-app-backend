package com.gavilan.springbootbackendapirest.models.dao;

import com.gavilan.springbootbackendapirest.models.entity.Factura;
import org.springframework.data.repository.CrudRepository;

public interface IFacturaDao extends CrudRepository<Factura, Long> {

}
