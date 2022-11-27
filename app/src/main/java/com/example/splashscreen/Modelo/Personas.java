package com.example.splashscreen.Modelo;

import java.io.Serializable;

public class Personas implements Serializable {
    int idpersonas;
    String nombre;
    String apellido;
    String edad;
    String genero;
    String direccion;
    String telefono;
    String correo;
    String tipo_persona_id_tipo_persona;

    public int getId(){
        return idpersonas;
    }

    public void setid(int idpersonas){
        this.idpersonas= idpersonas;

    }

    public String getnombre(){
        return nombre;
    }

    public void setnombre(String nombre) {
        this.nombre = nombre;

    }

    public String getapellido(){
        return apellido;
    }

    public void setapellido(String apellido) {
        this.apellido = apellido;

    }
    public String getaedad(){
        return edad;
    }

    public void setedad(String edad) {
        this.edad = edad;

    }

    public String getagenero(){
        return genero;
    }

    public void setgenero(String genero) {
        this.genero = genero;

    }

    public String getdireccion(){
        return direccion;
    }

    public void setdireccion(String direccion) {
        this.direccion = direccion;

    }
    public String gettelefono(){
        return telefono;
    }

    public void settelefono(String telefono) {
        this.telefono = telefono;

    }

    public String getcorreo(){
        return correo;
    }

    public void setcorreo(String correo) {
        this.correo = correo;

    }
    public String gettipo_persona_id_tipo_persona(){
        return tipo_persona_id_tipo_persona;
    }

    public void settipo_persona_id_tipo_persona(String tipo_persona_id_tipo_persona) {
        this.tipo_persona_id_tipo_persona = tipo_persona_id_tipo_persona;

    }

}