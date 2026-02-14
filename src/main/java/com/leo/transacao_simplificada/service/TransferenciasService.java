package com.leo.transacao_simplificada.service;

import com.leo.transacao_simplificada.controller.TransacaoDTO;
import com.leo.transacao_simplificada.entity.Usuario;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TransferenciasService {

    private UsuarioService usuarioService

    public void transferirValores(TransacaoDTO transacaoDTO){
        Usuario pagqador usuarioService.buscarUsuario(transacaoDTO.payer());
        Usuario recebedor usuarioService.buscarUsuario(transacaoDTO.payee());

    }

}
