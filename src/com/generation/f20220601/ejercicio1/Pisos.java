package com.generation.f20220601.ejercicio1;

public class Pisos extends Edificio{
    //Atributos******************************************
    private Integer cantDepartamento;
    private String tipoDepartamento;
    private int numPiso;
    //Constructor****************************************

    public Pisos() {
    }

    public Pisos(Integer cantDepartamento, String tipoDepartamento, int numPiso) {
        this.cantDepartamento = cantDepartamento;
        this.tipoDepartamento = tipoDepartamento;
        this.numPiso = numPiso;
    }
    //Getter y Setter************************************


    public Integer getCantDepartamento() {
        return cantDepartamento;
    }

    public void setCantDepartamento(Integer cantDepartamento) {
        this.cantDepartamento = cantDepartamento;
    }

    public String getTipoDepartamento() {
        return tipoDepartamento;
    }

    public void setTipoDepartamento(String tipoDepartamento) {
        this.tipoDepartamento = tipoDepartamento;
    }

    public int getNumPiso() {
        return numPiso;
    }

    public void setNumPiso(int numPiso) {
        this.numPiso = numPiso;
    }

    @Override
    public String toString() {
        return "Pisos{" +
                "cantDepartamento=" + cantDepartamento +
                ", tipoDepartamento='" + tipoDepartamento + '\'' +
                ", numPiso=" + numPiso + super.toString() +
                '}';
    }
}




