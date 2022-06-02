package com.generation.f20220601.modelos;

public class Perro extends Mascota{
    //Atributos
    private Integer cantidadPaseos;
    private Float tamHocico;
    private String sonidoVocal;

    public Perro() {
    }

    public Perro(Integer cantidadPaseos, Float tamHocico, String sonidoVocal) {
        this.cantidadPaseos = cantidadPaseos;
        this.tamHocico = tamHocico;
        this.sonidoVocal = sonidoVocal;
    }

    public Integer getCantidadPaseos() {
        return cantidadPaseos;
    }

    public void setCantidadPaseos(Integer cantidadPaseos) {
        this.cantidadPaseos = cantidadPaseos;
    }

    public Float getTamHocico() {
        return tamHocico;
    }

    public void setTamHocico(Float tamHocico) {
        this.tamHocico = tamHocico;
    }

    public String getSonidoVocal() {
        return sonidoVocal;
    }

    public void setSonidoVocal(String sonidoVocal) {
        this.sonidoVocal = sonidoVocal;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "cantidadPaseos=" + cantidadPaseos +
                ", tamHocico=" + tamHocico +
                ", sonidoVocal='" + sonidoVocal + '\'' + super.toString() +
                '}';
    }
    @Override
    public void hacerSonido(){
        System.out.println("Guau, guau");
    }

}
