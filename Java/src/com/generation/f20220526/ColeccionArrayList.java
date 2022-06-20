package com.generation.f20220526;

import java.util.ArrayList;
import java.util.Collections;

public class ColeccionArrayList {
    public static void main(String[] args) {
        //ArrayList Dinamicos --> Se puede modificar su tamaño
        //Instancia de clase, definicion de variable de tipo arreglo
        ArrayList<String> colores = new ArrayList<String>();
        ArrayList<Integer> numerosPares = new ArrayList<Integer>();

        //Agregar elemento a la lista
        colores.add("blanco");
        colores.add("amarillo");

        //imprimir el contenido
        System.out.println(colores); //---> A diferencia que con los Array, con ArrayList se puede imprimir enseguida

        //con add(index,string) podemos ingresar un elemento a un indice especifico
        colores.add(2, "negro");
        System.out.println(colores);

        /*Al usar add(index,string) en un index ya existente,
        este incluye el elemento en ese indice y desplaza el original un espacio a la derecha*/
        colores.add(1, "azul");
        System.out.println(colores);

        System.out.println("\n");
        //acceder a un elemento
        System.out.println(colores.get(1));

        //NO PODEMOS ACCEDER A UN INDICE INEXITENTE, NUESTRO LIMITE ES EL ULTIMO INDICE EN LA LISTA

        System.out.println(colores.size()); //---> Simil al ".lenght" / lenght = array estaticos / size = dinamicos

        //Para modificar un elemento utilizamos el ".set"
        colores.set(0, "rojo");
        System.out.println(colores);

        //Quitar un elemento. arreglo.remove(posicion);
        colores.remove(2);
        System.out.println(colores);

        //Quitar todos los elementos
        colores.clear();
        System.out.println(colores);

        colores.add("blanco");
        colores.add("amarillo");
        colores.add("café");
        colores.add("azul");

        //recorrer el arreglo
        for (int i = 0; i < colores.size(); i++){
            System.out.println(colores.get(i));
        }

        System.out.println("**************");

        for (String color : colores){
            System.out.println(color);
        }

        System.out.println("\n****Arreglo ordenado****\n");
        //Ordenar el arreglo de forma ascendente
        Collections.sort(colores); //Afecta directamente el arreglo, PERMANENTEMENTE
        System.out.println(colores);

        System.out.println("**************");

        numerosPares.add(14);
        numerosPares.add(2);
        numerosPares.add(56);
        numerosPares.add(8);
        numerosPares.add(16);
        numerosPares.add(96);

        System.out.println("\nArreglo desordenado");
        System.out.print(numerosPares + " ");
        System.out.println();

        System.out.println("\nOrdenado de menor a mayor");
        Collections.sort(numerosPares);
        System.out.print(numerosPares + " ");
        System.out.println();

        System.out.println("\nEl reverse invierte el orden del arreglo");
        Collections.reverse(numerosPares); //---> Invierte el orden del arreglo
        System.out.print(numerosPares);

    }
}
