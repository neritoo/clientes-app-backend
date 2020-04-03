package com.gavilan.springbootbackendapirest.models.dao;

import com.gavilan.springbootbackendapirest.models.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IProductoDao extends CrudRepository<Producto, Long> {

    @Query("select p from Producto p where p.nombre like %?1%")
    public List<Producto> findByNombre(String consulta);

    //Otra forma: utilizando spring JPA, haciendo la consulta a través del nombre del método:
    public List<Producto> findByNombreContainingIgnoreCase(String termino);
}
