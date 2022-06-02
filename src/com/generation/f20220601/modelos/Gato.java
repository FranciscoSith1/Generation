package com.generation.f20220601.modelos;

public class Gato extends Mascota {
    //La palabra "extends" significa que estamos usando herencia
    //Atributos
    private Boolean garraRetractil;
    private Boolean visionNocturna;
    private String sonidoVocal;

    public Gato() {
    }

    public Gato(Boolean garraRetractil, Boolean visionNocturna, String sonidoVocal) {
        this.garraRetractil = garraRetractil;
        this.visionNocturna = visionNocturna;
        this.sonidoVocal = sonidoVocal;
    }

    public Boolean getGarraRetractil() {
        return garraRetractil;
    }

    public void setGarraRetractil(Boolean garraRetractil) {
        this.garraRetractil = garraRetractil;
    }

    public Boolean getVisionNocturna() {
        return visionNocturna;
    }

    public void setVisionNocturna(Boolean visionNocturna) {
        this.visionNocturna = visionNocturna;
    }

    public String getSonidoVocal() {
        return sonidoVocal;
    }

    public void setSonidoVocal(String sonidoVocal) {
        this.sonidoVocal = sonidoVocal;
    }

    @Override
    public String toString() {
        return "Gato{" +
                "garraRetractil=" + garraRetractil +
                ", visionNocturna=" + visionNocturna +
                ", sonidoVocal='" + sonidoVocal + '\'' + super.toString() +
                '}';
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau, miau");
    }
}


