package com.generation.f20220524;

import java.util.Scanner;

public class Condicionales {
    public static void main(String[] args) {
        //capturar ingreso por consola
        Scanner sc = new Scanner(System.in);
        //validar la mayoria de edad
        //establecer punto critico --> 18 años

        int mayoriaEdad = 18;

        //solicitar el ingreso de edad
        System.out.println("Ingrese su edad");
        int edad = sc.nextInt(); //capturando el ingreso por consola y guardandolo en una var

        if(edad >= mayoriaEdad) {
            System.out.println("Usted es mayor de edad");
        }else{
            System.out.println("No está permitido su ingreso");
        }

        /*solicitar todos los strings primero
        *nombre, apellido, direccion
        *edad. numero, direccion
        *Saldo ($). minimo de 50k.
        *
        * Mayoria de edad
        * validar saldo, else, no puede apostar
        *
        * si es que tiene para apostar le vamos a preguntar cuanto esta dispuesta a apostar.
        *minimo de apuesta 10k
         */
    }
}
