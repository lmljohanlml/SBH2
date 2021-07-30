
package com.spring.h2.service;

import com.spring.h2.model.Usuario;
import com.spring.h2.reporsitories.UsuarioDAO;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author DrMerlyn
 */
@Service
public class UsuarioImpl  implements IUsuario{

    @Autowired
    private UsuarioDAO usuarioDao;
    
    @Override
    public void insert(Usuario usuario) {
        usuarioDao.save(usuario);
    }

    @Override
    public Optional<Usuario> selectById(Long idUsuario) {
        return usuarioDao.findById(idUsuario);
    }

    @Override
    public void update(Usuario usuario) {
        usuarioDao.save(usuario);
    }

    @Override
    public void delete(long idUsuario) {
        usuarioDao.deleteById(idUsuario);
    }

    @Override
    public List<Usuario> selectAll() {
        return usuarioDao.findAll();
    }
    
}
