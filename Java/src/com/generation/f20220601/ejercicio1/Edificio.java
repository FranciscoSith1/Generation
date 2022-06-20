package com.generation.f20220601.ejercicio1;

public class Edificio {
    //Atributos**************************************************
    private String direccion;
    private Integer pisos;
    private String color;
    private Integer puntosAcceso;

    //Constructores*******************************************

    public Edificio() {
    }

    public Edificio(String direccion, Integer pisos, String color, Integer puntosAcceso) {
        this.direccion = direccion;
        this.pisos = pisos;
        this.color = color;
        this.puntosAcceso = puntosAcceso;
    }

    //Setter y Getter**************************************************


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getPisos() {
        return pisos;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPuntosAcceso() {
        return puntosAcceso;
    }

    public void setPuntosAcceso(Integer puntosAcceso) {
        this.puntosAcceso = puntosAcceso;
    }

    //to String*******************************************
    @Override
    public String toString() {
        return "Edificio{" +
                "direccion='" + direccion + '\'' +
                ", pisos=" + pisos +
                ", color='" + color + '\'' +
                ", puntosAcceso=" + puntosAcceso +
                '}';
    }
}
