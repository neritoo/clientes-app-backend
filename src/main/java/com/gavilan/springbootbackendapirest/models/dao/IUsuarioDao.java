package com.gavilan.springbootbackendapirest.models.dao;

import com.gavilan.springbootbackendapirest.models.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface IUsuarioDao extends CrudRepository<Usuario, Long> {

    public Usuario findByUsername(String username);

    //@Query("select u from Usuario u where u.username = ?1")
    //public Usuario encontrarUsuario(String username);
}
