package com.akkodis.finalapp.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.akkodis.finalapp.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Optional<Usuario> findByCorreo(String correo);
}