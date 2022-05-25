package com.generation.f20220523;

public class CalculoPromedio {
    public static void main(String[] args) {
        //int cantidadNotas = 12;
        //arreglo
        Integer[] notas = {20,50,67,99,10,0,88,77,58,79,33,50};

        int sumaNotas = 0;

        //como recorrer el arreglo de notas
        for (int i = 0; i < notas.length; i++){
            sumaNotas = sumaNotas + notas[i];
        }
        System.out.println("Suma de notas " + sumaNotas);

        //promedio--> suma de todas las notas dividido por la cantidad de notas;
        float promedioNotas = sumaNotas / notas.length;

        if(promedioNotas >= 50 && promedioNotas <= 100){
            System.out.println("Apobado");
        }else{
            System.out.println("Reprobado");
        }
    }
}
