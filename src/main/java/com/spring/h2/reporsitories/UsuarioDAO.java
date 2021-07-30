
package com.spring.h2.reporsitories;

import com.spring.h2.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author DrMerlyn
 */
public interface UsuarioDAO extends JpaRepository<Usuario, Long>{
    
    public String Buscar(Usuario usuario);
    
}
