package com.spring.h2.service;

import com.spring.h2.model.Usuario;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author DrMerlyn
 */
public interface IUsuario {
    
    public void insert(Usuario usuario);
    
    public Optional<Usuario> selectById(Long idUsuario);
    
    public void update(Usuario usuario);
    
    public void delete(long idUsuario);
    
    public List<Usuario> selectAll();
    
}
