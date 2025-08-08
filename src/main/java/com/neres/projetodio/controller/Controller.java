package com.neres.projetodio.controller;

import com.neres.projetodio.model.Usuario;
import com.neres.projetodio.repository.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users") // prefixo padrão do localhost end-point padrão da porta 8080
public class Controller {

    @Autowired
    private UserRespository userRespository;

    @GetMapping()
    public List<Usuario> getUsers(){
        return userRespository.findAll();
    }

    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable String username){
        return userRespository.FindByUsername(username);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Integer id){
        userRespository.DeleteById(id);
    }

    @PostMapping()
    public void save(@RequestBody Usuario usuario){
        userRespository.save(usuario);
    }

    @PutMapping()
    public void putUser(@RequestBody Usuario usuario){
        userRespository.save(usuario);
    }


}
