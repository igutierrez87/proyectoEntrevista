package com.entrevista.repositorios;

import com.entrevista.modelo.Usuario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository("usuarioRepository")
public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
