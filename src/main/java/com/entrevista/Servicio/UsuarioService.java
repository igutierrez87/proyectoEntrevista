package com.entrevista.Servicio;

import com.entrevista.modelo.Usuario;

public interface UsuarioService {
    Usuario guardarUsuario(String userName, String password);
}
