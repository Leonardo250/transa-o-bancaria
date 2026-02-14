package com.leo.transacao_simplificada.service;

import com.leo.transacao_simplificada.entity.Usuario;
import com.leo.transacao_simplificada.exceptions.UserNotFound;
import com.leo.transacao_simplificada.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public Usuario buscarUsuario(Long id){
       return usuarioRepository.findById(id).orElseThrow(() ->new UserNotFound("Usuario não encontrado"));
    }
}
