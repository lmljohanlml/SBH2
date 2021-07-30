package com.spring.h2.controller;

import com.spring.h2.model.Usuario;
import com.spring.h2.service.IUsuario;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author DrMerlyn
 */
@RestController
public class UsuarioController {
    
    @Autowired
    private IUsuario iUsuario;
    
    @GetMapping("/listarUsuarios")
    public List<Usuario> listarUsuarios(){
        return iUsuario.selectAll();
    }
    
    @GetMapping("/buscarUsuario/{idUsuario}")
    public Optional<Usuario> buscarusuario(@PathVariable Long idUsuario){
       return iUsuario.selectById(idUsuario);
    }
    @PostMapping("/insertarUsuario")
    public void insertarUsuario(@RequestBody Usuario usuario){
        iUsuario.insert(usuario);
    }
    
    @PutMapping("/actualizarUsuario")
    public void actualizarUsuario(@RequestBody Usuario usuario){
        iUsuario.update(usuario);
    }
    
    @DeleteMapping("/borrarUsuario/{idUsuario}")
    public void borrarUsuario(@PathVariable Long idUsuario){
        iUsuario.delete(idUsuario);
    }
    
    
    
}
