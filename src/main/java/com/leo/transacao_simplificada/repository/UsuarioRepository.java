package com.leo.transacao_simplificada.repository;

import com.leo.transacao_simplificada.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
