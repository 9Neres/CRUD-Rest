package com.neres.projetodio.repository;

import com.neres.projetodio.handlers.BusinessException;
import com.neres.projetodio.handlers.CampoObrigatorioException;
import com.neres.projetodio.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRespository {

    public void save(Usuario usuario) {
        if (usuario.getLogin() == null) {
            throw new CampoObrigatorioException("E obrigatorio o login");
        }

        if (usuario.getSenha() == null) {
            throw new CampoObrigatorioException("E obrigatorio a senha");
        }

        if(usuario != null){
            System.out.println("Save - Salvando usuario na camada: " + usuario);
        }else{
            System.out.println("Update - recebendo usuário na camada repositorio");

            System.out.println(usuario);
        }
    }

    public void DeleteById(Integer id){
        System.out.println(String.format("Deletando usuario com id: %d nome: %s senha: %s", id));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        System.out.println("List - listando todos os usuarios");
        List<Usuario> Usuarios = new ArrayList<>();
        Usuarios.add(new Usuario(1, "rick", "123"));
        Usuarios.add(new Usuario(2, "caio", "456"));
        return Usuarios;
    }

    public Usuario FindById(Integer id){
        System.out.println(String.format("FindById - buscando usuario com id: %d", id));
        return new Usuario(1, "rick", "123");
    }

    public Usuario FindByUsername(String username){
        System.out.println(String.format("FindByLogin - buscando usuario com login: %s", username));
        return new Usuario(1, "rick", "123");
    }



}
