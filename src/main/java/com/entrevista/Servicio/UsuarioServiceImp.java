package com.entrevista.Servicio;

import com.entrevista.modelo.Usuario;
import com.entrevista.repositorios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("usuarioServiceImp")
public class UsuarioServiceImp implements UsuarioService{

    @Autowired
    @Qualifier("usuarioRepository")
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario guardarUsuario(String userName, String password) {
        Usuario usuario = new Usuario();
        usuario.setUserName(userName);
        usuario.setPassword(password);
        return usuarioRepository.save(usuario);
    }
}
