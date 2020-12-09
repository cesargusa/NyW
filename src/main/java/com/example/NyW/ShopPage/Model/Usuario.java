package com.example.NyW.ShopPage.Model;


import java.time.LocalDate;

import com.example.NyW.ShopPage.NyWShopPageApplication;


public class Usuario {
        private static int idEstatica = 0;
        private int _idUsuario;
        private String _usuario;
        private String _correo;
        private String _contraseña;
        private LocalDate _fechaRegistro;

        public Usuario(){}

        public Usuario(String usuario, String contraseña, String correo){
            _idUsuario=++idEstatica;
            this._usuario=usuario;
            this._correo=correo;
            this._contraseña=contraseña;
            Fecha();
            
        }

        public static int getIdEstatica() {
            return idEstatica;
        }

        public static void setIdEstatica(int idEstatica) {
            Usuario.idEstatica = idEstatica;
        }

        public int get_idUsuario() {
            return _idUsuario;
        }

        public void set_idUsuario(int _idUsuario) {
            this._idUsuario = _idUsuario;
        }

        public String get_usuario() {
            return _usuario;
        }

        public void set_usuario(String _usuario) {
            this._usuario = _usuario;
        }

        public String get_contraseña() {
            return _contraseña;
        }

        public void set_contraseña(String _contraseña) {
            this._contraseña = _contraseña;
        }

      

        public String get_correo() {
            return _correo;
        }

        public void set_correo(String _correo) {
            this._correo = _correo;
        }

    public void Fecha(){
        this._fechaRegistro= NyWShopPageApplication.da();
    }

    public LocalDate get_fechaRegistro() {
        return _fechaRegistro;
    }

    public void set_fechaRegistro(LocalDate _fechaRegistro) {
        this._fechaRegistro = _fechaRegistro;
    }

}
