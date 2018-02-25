package com.entrevista.repositorios;

import com.entrevista.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
