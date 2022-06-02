package com.generation.f20220601.ejercicio1;

public class Departamento extends Pisos{
    private String nombreDueño;
    private int numPiezas;

    public Departamento() {
    }

    public Departamento(String nombreDueño, int numPiezas) {
        this.nombreDueño = nombreDueño;
        this.numPiezas = numPiezas;
    }

    public String getNombreDueño() {
        return nombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        this.nombreDueño = nombreDueño;
    }

    public int getNumPiezas() {
        return numPiezas;
    }

    public void setNumPiezas(int numPiezas) {
        this.numPiezas = numPiezas;
    }

    @Override
    public String toString() {
        return "Departamento{" +
                "nombreDueño='" + nombreDueño + '\'' +
                ", numPiezas=" + numPiezas + super.toString() +
                '}';
    }
}
