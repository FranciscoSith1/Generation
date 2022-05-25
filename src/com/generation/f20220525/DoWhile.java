package com.generation.f20220525;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        // DoWhile
        // a lo menos se ejecutara una vez, no así el While
        int termino = 8;
        do {

            System.out.println("DoWhile el valor de termino es " + termino);
            termino++;
        } while (termino <= 10);

        System.out.println("***************");

        while (termino <= 10) {
            System.out.println("While el valor de termino es " + termino);
            termino++;
        }
        System.out.println("***** FIN *****");

        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do {
            System.out.println("1 sumar \n2 restas \n3 multiplicar \n4 dividir");
            opcion = sc.nextInt();
        }while(opcion < 0 || opcion > 4);
    }
}