package com.example.NyW.ShopPage.API;

import java.util.ArrayList;

import com.example.NyW.ShopPage.Model.Usuario;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsuariosViewController {
    
    @GetMapping("/login")
    public ModelAndView mv(@RequestParam(name = "id", defaultValue = "0", required = false) int id){
        ArrayList<Usuario> usuarios = UsuariosController.FindAllUsuarios(id);

        ModelAndView mv = new ModelAndView("login");
        mv.addObject("usuarios", usuarios);
        return mv;
    }
  

}
