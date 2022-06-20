package com.generation;

public class Main {
    public static void main(String[] args) {
        //variables primitivas
        //Se define el tipo de dato al cual pertenecera la variable
        //tipo de dato + nombre_variable = asigancion
        String nombre = "Francisco Cid\nHola";
        System.out.println(nombre);

        //variables numericas

        //8 bit
        byte numeroByte = 100;
        System.out.println(numeroByte);

        short numeroShort = 525;
        System.out.println(numeroShort);

        //32 bit
        int numeroInt = 25;
        System.out.println(numeroInt - 2022);

        //32 bit
        long numeroLong = 1458796;
        System.out.println(numeroLong);

        //16 bit (un solo caracter) -> un solo caracter entre comila simple
        char letraA = 'a';

        //variable booleana (true o false)
        boolean acepta = true;//false

        //tambien existen del tipo float y double ( usan decimales)

        String genero = "Masculino";
        System.out.println(genero);

        String cabello = "Café";
        System.out.println(cabello);

        boolean comprometido = false;
        System.out.println(comprometido);

        String poblacion = "La Florda";
        System.out.println(poblacion);

        int edad = 25;
        System.out.println(edad);

        String nombre1 = "Francisco";
        System.out.println(nombre1);

        String ocupacion = "estudiante";
        System.out.println(ocupacion);

        //variables de tipo objeto
        nombre.charAt(0);
        System.out.println(nombre.charAt(0));

        String curso = "G1";
        //Los strings se comparan con "Equals". Los numeros se comparan con "=="
        if (curso.equals("g1")) {
            System.out.println("iguales");
        }else {
            System.out.println("distintos");
        }

        if (curso.equalsIgnoreCase("g1")) {
            System.out.println("iguales");
        }else {
            System.out.println("distintos");
        }

        if(curso.toUpperCase().equals("g1")){
            System.out.println("iguales");
        }

        if(curso.toLowerCase().equals("G1")){
            System.out.println("son distintas");
        }else {
            System.out.println("si, son iguales");
        }

        String curso2= "";   //vacio
        String curso3 = null;//null

        //comparar un String con un null
        if(null == curso3) {
            System.out.println("es nulo");
        }

    //Float y Double de tipo objeto
        //cast es convertir un dato a otro tipo e dato
        float altura = (float) 1.71;//tabien podria haber escrito poniendo un "f" al fina. 1.71f

        Float peso = 75.5f;

        System.out.println(altura);
        System.out.println(peso);

        Float gravedad = Float.parseFloat("9.6");
        System.out.println(gravedad);

        /*PARSE --> convertir un String a un tipo de numero
        Float.parseFloat("9.6");
        Integer.parseInt("23");
        Long.parseLong("123456789");
        Double.parseDouble("12345.678");
         */

        //EJERCICIO
        System.out.println("EJERCICIOS");

        int numerito = 22;
        System.out.println(numerito);

        long numerote = (long) numerito;
        System.out.println(numerote);

        byte mini = (byte) numerito;
        System.out.println(mini);

        short numeritoShort = (short) numerito;
        System.out.println(numeritoShort);

        Double peso2 = 75.9;
        Float peso2F =  peso2.floatValue();

        /*
        + - * / % ---> OPERADORES
        == != > >= < <= () ---> COMPARACION
        */
        int dos = 2;
        int tres = 3;
        if( 5 == (tres+dos) ) {
            System.out.println(tres + dos);
        }else{
            System.out.println("No es 5");
        }


    }


}
