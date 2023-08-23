package com.uspring.USpring.Repository;

import com.uspring.USpring.Entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findByUsername(String username);

}
