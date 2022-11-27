package com.example.splashscreen.Modelo;

import java.io.Serializable;

public class lugar implements Serializable {


    int codigo_servicios;
    String nombre_servicio;
    String direccion_servicio;
    String ciudad_servicio;
    String telefono_servicio;
    String horarios_servicio;
    String fecha_ingreso;
    String fecha_salida;
    String cantidad_producto;
    String urls;
    String precio;
    String tipo_lugar_idtipo_lugar;
    String tipo_servicio_id_servicios;
    String municipio;
    String vereda;
    String municipios_id_municipio;

    public int getid() {
        return codigo_servicios;
    }

    public void setid(int codigo_servicios) {
        this.codigo_servicios = codigo_servicios;
    }

    public String getnombre_servicio() {
        return nombre_servicio;
    }

    public void setnombre_servicio(String nombre_servicioe) {
        this.nombre_servicio = nombre_servicio;

    }

    public String getdireccion_servici() {
        return direccion_servicio;
    }

    public void setdireccion_servicio(String direccion_servicio) {
        this.direccion_servicio = direccion_servicio;

    }

    public String geciudad_servicio() {
        return ciudad_servicio;
    }

    public void setciudad_servicio(String ciudad_servicio) {
        this.ciudad_servicio = ciudad_servicio;
    }

    public String gettelefono_servicio() {
        return telefono_servicio;
    }

    public void settelefono_servicio(String telefono_servicio) {
        this.telefono_servicio = telefono_servicio;
    }

    public String gethorarios_servicio() {
        return horarios_servicio;
    }

    public void sethorarios_servicio(String horarios_servicio) {
        this.horarios_servicio = horarios_servicio;
    }

    public String getfecha_ingreso() {
        return fecha_ingreso;
    }

    public void setfecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }


    public String getfecha_salida() {
        return fecha_salida;
    }

    public void setfecha_salida(String fecha_salida) {
        this.fecha_salida = fecha_salida;

    }

    public String getcantidad_producto() {
        return cantidad_producto;
    }

    public void setcantidad_producto(String cantidad_producto) {
        this.cantidad_producto = cantidad_producto;

    }

    public String geturls(){
        return urls;
    }

    public void seturls(String urls) {
        this.urls = urls;

    }
    public String getprecio(){
        return precio;
    }

    public void setprecio(String precio) {
        this.precio = precio;

    }
    public String gettipo_lugar_idtipo_lugar(){
        return tipo_lugar_idtipo_lugar;
    }

    public void settipo_lugar_idtipo_lugar(String tipo_lugar_idtipo_lugar) {
        this.tipo_lugar_idtipo_lugar = tipo_lugar_idtipo_lugar;

    }
    public String tipo_servicio_id_servicios(){
        return tipo_servicio_id_servicios;
    }

    public void settipo_servicio_id_servicios(String tipo_servicio_id_servicios) {
        this.tipo_servicio_id_servicios = tipo_servicio_id_servicios;

    }
    public String getmunicipio(){
        return municipio;
    }

    public void setmunicipioe(String municipio) {
        this.municipio = municipio;

    }

    public String getvereda(){
        return vereda;
    }

    public void setvereda(String vereda) {
        this.vereda = vereda;

    }

    public String getmunicipios_id_municipio(){
        return municipios_id_municipio;
    }

    public void setmunicipios_id_municipio(String municipios_id_municipio) {
        this.municipios_id_municipio = municipios_id_municipio;

    }
}
