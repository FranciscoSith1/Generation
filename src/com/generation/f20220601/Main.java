package com.generation.f20220601;

import com.generation.f20220601.modelos.Gato;
import com.generation.f20220601.modelos.Mascota;
import com.generation.f20220601.modelos.Mishi;
import com.generation.f20220601.modelos.Perro;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Herencia --> Entregar algo que antes era mio

        Mascota mascota = new Mascota();
        mascota.setColor("Café");
        mascota.setNombre("Max");

        Perro perro = new Perro();
        perro.setColor("amarillo");
        perro.setNombre("Pato");
        perro.setEspecia("Canino");
        perro.setPelaje("Pelo");
        perro.setPeso(15);
        perro.setSexo("Macho");

        Gato gato = new Gato();
        gato.setColor("rojo");
        gato.setNombre("Terry");
        gato.setEspecia("Felino");
        gato.setPelaje("Pelo");
        gato.setPeso(3);
        gato.setSexo("Macho");
        gato.setGarraRetractil(true);
        gato.setSonidoVocal("Maullido");
        gato.setVisionNocturna(true);

        //System.out.println(gato.toString());

        Mishi mishi = new Mishi(true);
        //mishi.setColor("Rojo");
        System.out.println(mishi.toString());


        /*Polimorfismo ---> Un objeto Padre se comporta como hijo*/


        Mascota regalon = new Mascota("Negro", "Canes","Pelo","Firulais",1.5f,"Macho");


        Mascota felix = new Gato();
        felix.setNombre("Felix");
        felix.setColor("Negro");
        felix.setPeso(3);


        Mascota chocolo = new Perro();
        chocolo.setNombre("Chocolo");
        chocolo.setColor("Café");
        chocolo.setPeso(10);


        List<Mascota> listaMascotas = new ArrayList<Mascota>();
        listaMascotas.add(regalon);
        listaMascotas.add(felix);
        listaMascotas.add(chocolo);

        //MUCHAS FORMAS DE RESPUESTA*******************************************
        regalon.hacerSonido();//Llamando al metodo en mascota
        felix.hacerSonido();
        chocolo.hacerSonido();

        System.out.println("******");
        //recorrer el arreglo
        for (Mascota mascota2 : listaMascotas) {
            mascota2.hacerSonido();
        }

        //transformar un objeto generico a uno especifico
        Perro perroChocolo = (Perro) chocolo;
        perroChocolo.setCantidadPaseos(2);

    }
}
