package com.nidia.personalizedlist.week;


public class Dias {

    private String dia, descripcion, imagen;
    private int img;

    public Dias(){

    }

    public Dias(String dia, String descripcion, int img){
        this.dia = dia;
        this.descripcion = descripcion;
        this.img = img;
    }

    public String getDia(){
        return dia;
    }

    public void setDia(String dia){
        this.dia = dia;
    }
    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }
    public int getImg(){
        return img;
    }

    public void setImg(int img){
        this.img = img;
    }
}
