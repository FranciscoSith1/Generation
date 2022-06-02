package com.generation.f20220601.modelos;

public class Mishi extends Gato {
    private Boolean famosoEnInternet;

    public Mishi() {
    }

    public Mishi(Boolean famosoEnInternet) {
        this.famosoEnInternet = famosoEnInternet;
    }

    public Boolean getFamosoEnInternet() {
        return famosoEnInternet;
    }

    public void setFamosoEnInternet(Boolean famosoEnInternet) {
        this.famosoEnInternet = famosoEnInternet;
    }

    @Override
    public String toString() {
        return "Mishi{" +
                "famosoEnInternet=" + famosoEnInternet +
                '}';
    }
}
