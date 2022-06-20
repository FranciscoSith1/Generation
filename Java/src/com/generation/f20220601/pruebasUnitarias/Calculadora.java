package com.generation.f20220601.pruebasUnitarias;

public class Calculadora {

    public int suma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public int resta(int numero1, int numero2) {
        return numero1 - numero2;
    }

    public int multiplicacion(int numero1, int numero2) {
        return numero1 * numero2;
    }

    public String division(int numero1, int numero2) {
        if (numero2 != 0) {
            String resultado = Integer.toString(numero1 / numero2);
            return resultado;
        } else {
            return "No se puede dividir por cero";
        }
    }

    public String Pares(int numero) {
        if (numero % 2 == 0) {
            String resultado = "Tu numero es par";
            return resultado;
        } else {
            return "tu numero es Impar";
        }
    }


    public String Impares(int numero) {
        if (numero % 2 != 0) {
            String resultado = "Tu numero es impar";
            return resultado;
        } else {
            return "tu numero es par";
        }
    }

}





