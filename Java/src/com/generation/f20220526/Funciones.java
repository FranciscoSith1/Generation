package com.generation.f20220526;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Funciones {
    public static void main(String[] args) {
        //funciones o metodos
        //4 tipos de funciones
        //NO SE PUEDE CREAR UN METODO DENTRO DE OTRO, PERO SI SE PUEDEN LLAMAR ENTRE SI
        //para llamar una funcion debemos utilizar su nombre igual que en JS

        saludo();

        calculoSumaPares(3, 5);

        int edad = obtenerEdad();
        System.out.println(edad);

        boolean mayorMenor = validarMayorEdad(edad);
        if(mayorMenor){
            System.out.println("Edad permitida");
        }else{
            System.out.println("Edad no permitida");
        }
    }
    //para crear una funcion lo hacemos fuera del MAIN, ya que el main ya es una funcion
    //las funciones de tipo public permite que sean invocables desde cualquier parte
    //Hay 2 que retornan y 2 que no retornan
    //Void no retrona, solo ejecuta
    //El nombre de la funcion se escriben con minuscula la primera letra SIEMPRE

    //Static nos permite acceder al metodos
    // accesador / tipo_de_retorno / nombre_funcion(parametros a recibir)

    public static void calculoSumaPares(int numero1, Integer numero2) {
        System.out.println(numero1 + numero2);
    }

    public static void saludo() {
        //solicitar el ingreso de datos
        System.out.println("Buenos dias");
    }

    //funciones que retornan un tipo de datos
    public static Integer obtenerEdad() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese edad");
        Integer edad = scanner.nextInt();//18;
        return edad;//retornar el contenido de la variable

    }

    public static Boolean validarMayorEdad(Integer edad) {
        if (edad >= 18) {
            System.out.println("Es mayor de edad");
            return true; //o false
        } else {
            System.out.println("Es menor de edad");
            return false;
        }
    }
}
