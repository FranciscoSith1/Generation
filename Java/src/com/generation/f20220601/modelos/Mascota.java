package com.generation.f20220601.modelos;

public class Mascota {
    //Atributos

    private String color;
    private String especia;
    private String pelaje;
    private String nombre;
    private float peso;
    private String sexo;

    //CONSTRUCTOR VACIO
    public Mascota() {
    }

    //CONTRUCTOR CON ATRIBUTOS
    public Mascota(String color, String especia, String pelaje, String nombre, float peso, String sexo) {
        this.color = color;
        this.especia = especia;
        this.pelaje = pelaje;
        this.nombre = nombre;
        this.peso = peso;
        this.sexo = sexo;
    }

    //GETTER Y SETTER
    public String getColor(String negro) {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEspecia() {
        return especia;
    }

    public void setEspecia(String especia) {
        this.especia = especia;
    }

    public String getPelaje() {
        return pelaje;
    }

    public void setPelaje(String pelaje) {
        this.pelaje = pelaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Mascota{" +
                "color='" + color + '\'' +
                ", especia='" + especia + '\'' +
                ", pelaje='" + pelaje + '\'' +
                ", nombre='" + nombre + '\'' +
                ", peso=" + peso +
                ", sexo='" + sexo + '\'' +
                '}';
    }

    public void hacerSonido(){
        System.out.println("Muuuu");
    }

}
