package com.generation.f20220526;

import java.util.Arrays;

public class ColeccionArray {
    public static void main(String[] args) {
        //Array ESTATICOS --> NO SE PUEDE CAMBIAR EL TAMAÑO. SE PUEDE MODIFICAR, PERO NO ASÍ INCLUIR MÁS
        String[] colores = {"white", "green", "red", "black", "brown"};
        Integer[] numerosPares = {2, 4, 6, 8, 10, 12, 16};
        int[] primerosNumeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        //posicion inicial es "0"
        System.out.println(colores[0]);
        System.out.println(numerosPares[0]);
        System.out.println(primerosNumeros[0]);

        //nombreArray[posicion] ----> Accediendo al elementos del arreglo en esa posicion
        System.out.println(colores[1]);

        numerosPares[3] = 25; //modifica el elemento de la posicion
        System.out.println(numerosPares[3]);

        /*numerosPares[7] = 14; //FUERA DE INDICE. No podemos agregar por posicion si no existe el elemento
        System.out.println(numerosPares[7]);*/

        System.out.println("Tamaño array colores " + colores.length);
        System.out.println("Tamaño array numeros pares " + numerosPares.length);
        System.out.println("Tamaño array primeros numeros " + primerosNumeros.length);

        //System.out.println(colores); //[Ljava.lang.String;@682a0b20 --> los corchetes indican que es un array. luego muestra el tipo de dato. los numeros son el espacio de memoria
        System.out.println(numerosPares.toString());// ----> no funciona para mostrar el contenido
        //System.out.println(primerosNumeros);//[I@214c265e --> en este caso se indica que el tipo de dato es primitivo

        //Array.toString(); ---> Permite imprimir el contenido del arreglo
        System.out.println(Arrays.toString(colores));
        System.out.println(Arrays.toString(numerosPares));
        System.out.println(Arrays.toString(primerosNumeros));

        //recorrer un arreglo
        for (int i = 0; i < primerosNumeros.length; i++) {
            System.out.print(primerosNumeros[i] + " "); //la "ln" pone un salto de linea entre cada impresion, sin la "ln" imprime para el lado
        }
        System.out.println("\n");

        //foreach  ---> Es la forma abreviada del for tradicional
        for (String color : colores){
            System.out.println(color);
        }

    }
}