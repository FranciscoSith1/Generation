package com.generation.f20220524;

import java.util.Scanner;

public class EjercicioCondicionales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int mayoriaEdad = 18;
        System.out.println("Ingrese su nombre y apellido");
        String nombreapellido = sc.nextLine();
        System.out.println("Ingrese su direccion");
        String direccion = sc.nextLine();
        System.out.println("Ingrese su numero de casa");
        int numeroCasa = sc.nextInt();


        System.out.println("Ingrese su edad");
        int edad = sc.nextInt();
        if(edad >= mayoriaEdad) {
            System.out.println("Edad aceptada");
        }

        System.out.println("\nIngrese su saldo");
        int saldo = sc.nextInt();
        int minsaldo = 50000;



            System.out.println("Apueste lo que quiera");








        int minapuesta = 10000;


        if (saldo >= minsaldo ){

            System.out.println("Apueste lo que quiera");

        } else {
            System.out.println("PA FUERA");
        }

        System.out.println("\nIngrese su apuesta, la minima apuesta hoy es de 10000");
        int apuesta = sc.nextInt();

        if (apuesta > minapuesta){

            System.out.println("Disfrute su partida");

        } else {
            System.out.println("Ingrese un saldo mayor");
        }



    }
}

