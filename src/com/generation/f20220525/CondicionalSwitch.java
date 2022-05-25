package com.generation.f20220525;

import java.util.Scanner;

public class CondicionalSwitch {
    public static void main(String[] args) {
        //menu
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese opcion");
        System.out.println("1 sumar \n2 restas \n3 multiplicar \n4 dividir");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1: //sumar
                //accion para la opcion 1
                System.out.println("**Suma**");
                break;
            case 2:
                System.out.println("**Resta**");
                break;
            case 3:
                System.out.println("**Multiplicacion**");
                break;
            case 4:
                System.out.println("**Division**");
                break;
            default:
                System.out.println("Opcion invalida");
                break;
        }

    }
}
