package com.generation.f20220524;

public class CalculoPromedioa {
    public static void main(String[] args) {
        //int cantidadNotas = 12;
        //arreglo
        Integer[] notas = {200,-50,-67,399,10,0,88,774,58,-79,33,50};

        int sumaNotas = 0;
        int notasFueraDeRango = 0;
        //como recorrer el arreglo de notas
        for (int i = 0; i < notas.length; i++){
            //validar la nota
            if(notas[i] < 0 || notas[i] > 100){
                System.out.println("La nota: " + notas[i] + " en la posicion " + (i+1) + " está fuera de rango.");
                notasFueraDeRango++;
            }
            sumaNotas = sumaNotas + notas[i];
        }
        System.out.println("Suma de notas " + sumaNotas);

        //promedio--> suma de todas las notas dividido por la cantidad de notas;
        float promedioNotas = sumaNotas / notas.length;
        System.out.println("\nEl promedio es: " + promedioNotas);
        //PUNTO CRITICO
        //0>=Reprobado<=49; 50>=Aprobado<=100
        if(promedioNotas >= 50 && promedioNotas <= 100){
            System.out.println("Apobado");
        }else if(promedioNotas >= 0 && promedioNotas <50) {
            System.out.println("Reprobado");
        }else{
            System.out.println("ERROR: Cálculo fuera de los rangos");
        }
    }
}
