package com.example.NyW.ShopPage.API;

import java.util.ArrayList;
import java.util.Arrays;

import com.example.NyW.ShopPage.Model.Usuario;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuariosController {
    
    public static ArrayList<Usuario> usuarios = new ArrayList<Usuario>(Arrays.asList(
        new Usuario("cesar","Ce$ar1997","cesargusa22@gmail.com"),
        new Usuario("javipasa","cesarcarahuevo13","javipasas22@gmail.com")

    ));

    //DEVUELVE TODOS LOS USUARIOS O LOS USUARIOS ESPECIFICOS POR ID
    @GetMapping("/usuarios")
    public static ArrayList<Usuario> FindAllUsuarios(@RequestParam(name = "id",defaultValue = "0",required = false) int id){
            ArrayList<Usuario> usuariosId = new ArrayList<>();
        if(id == 0){
            return usuarios;
        }else{
            for(Usuario ele: usuarios){
                if(id == ele.get_idUsuario()){
                    usuariosId.add(ele);
                }
            }
            return usuariosId;
        }

      
    }



}
