package com.example.splashscreen;

public class lugares {

    private int imagen;
    private String nombre;
    private int visitas;

    public lugares(int imagen, String nombre, int visitas) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.visitas = visitas;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getVisitas() {
        return visitas;
    }

    public void setVisitas(int visitas) {
        this.visitas = visitas;
    }
}

