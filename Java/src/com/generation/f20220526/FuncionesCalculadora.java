package com.generation.f20220526;

import java.util.Scanner;

public class FuncionesCalculadora {
    public static void main(String[] args) {
//Math ---> Libreria
        //elevar o potencia
        double numeroElevado = Math.pow(3, 3);
        System.out.println(numeroElevado);

        //Redondear al entero mayor
        double enteroMayor = Math.ceil(numeroElevado);
        System.out.println(enteroMayor);

        //Redondear al entero menor
        double enteroMenor = Math.floor(numeroElevado);
        System.out.println(enteroMenor);

        //Redondeo
        double enteroRedondeado = Math.round(numeroElevado);
        System.out.println(enteroRedondeado);

        //numero aleatorios
        //Math.random() >= 0.0 y <1.0
        double aleatorio = Math.random();
        System.out.println(aleatorio);

        //numeros aleatorios entre 0 y 10

        double num010 = Math.random() * 10;
        System.out.println(num010);

        //numeros aleatorios entre 2 y 8
        double num28 = 2 + (Math.random() * (8-2));
        System.out.println(Math.abs(num28));
        System.out.println(Math.round(num28));

        //numero aleatorio entre -4 y 4
        double numNegaPos = (Math.random()* (4 - -4)) + -4;
        System.out.println(numNegaPos);

    }

    public static void multiplicacion(int numero1, Integer numero2) {
        System.out.println(numero1 * numero2);
    }

    public static void division(int numero1, Integer numero2) {
        System.out.println(numero1 / numero2);
    }

}
