package com.gavilan.springbootbackendapirest.models.services;

import com.gavilan.springbootbackendapirest.models.entity.Usuario;

public interface IUsuarioService {
    public Usuario findByUsername(String username);
}
