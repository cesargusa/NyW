package com.example.NyW.ShopPage.API;

import java.util.ArrayList;
import java.util.Arrays;

import com.example.NyW.ShopPage.Model.Usuario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuariosController {
    
    public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>(Arrays.asList(
        new Usuario("cesar","cesargusa22@gmail.com","Ce$ar1997"),
        new Usuario("javipasa","javipasas22@gmail.com","cesarcarahuevo13")

    ));

    @GetMapping("/usuarios")
    public ArrayList<Usuario> FindAllUsuarios(){
        return usuarios;
    }
}
