package com.generation.f20220527;

public class Auto {
    //Una clase es un modelo o prototipo
    /*objeto -> Nace a partir de la clase, tiene caracteristicas o atributos
    * tiene metodos, se basa en algo concreto y lo lleva a algo abstracto(no tangible
    tangible: usamos los 5 sentidos para describirlo*/

    //En el caso de un auto tiene atributos/caracteristicas
    //Y tiene funciones, es decir, acciones que realiza

    //ATRIBUTO DE COLABORACION ---> Tomar un obj y usar como atributo


    /*El orden es: ---> Buena practica
    -atributo
    -constructores
    -accesadores y mutadores (get y set)
    -metodos o funciones
     */

    //atributo ---> van en privado (private)
    //accesador + tipo + nombreAtributo
    private String color;
    private String marca;
    private String modelo;
    private Double velocidad;

    //CONSTRUCTOR VACIO
    public Auto() { //Los constructores eben ser publicos
    }

    //Constructor --> Permite asignar valores a los atributos / tb permite instanciar
    //CONSTRUCTOR CON PARAMETROS
    public Auto(String color, String marca, String modelo, Double velocidad) {
        this.color = color;
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = velocidad;
    }

    //accesadores y mutadores (get y set)
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Double velocidad) {
        this.velocidad = velocidad;
    }

    //Metodos o funciones ---> Son personalizadas
    public void aumentarVelocidad(){
        this.velocidad = 10d;
    }






}
