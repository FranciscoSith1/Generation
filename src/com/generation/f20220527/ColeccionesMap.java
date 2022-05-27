package com.generation.f20220527;

import java.util.ArrayList;
import java.util.HashMap;

public class ColeccionesMap {
    public static void main(String[] args) {
        // colecciones Map o HashMap
        //Pares clave <--> valor
        //HashMap<String,String> objHashMap = new HashMap<>(); //---> DEFINICION
        //K es key o clave; V es value o valor
        //HashMap mapa = new HashMap(); ---> Escritura abreida del HashMap

        HashMap objHashMap = new HashMap();
        objHashMap.put("Nombre", "Francisco");
        objHashMap.put("ApellidoP", "Cid");
        objHashMap.put("ApellidoM", "Segovia");
        objHashMap.put("Edad", "25");

        System.out.println("Elementos del mapa");
        System.out.println(objHashMap);

        //Para obtener un valor se usa el ".get" --> Este requerira de la clave para dar el valor
        System.out.println(objHashMap.get("Nombre"));

        //elimiar par
        objHashMap.remove("Edad");
        System.out.println(objHashMap);

        //Muestra todas las llaves disponibles
        System.out.println(objHashMap.keySet());

        //Muestra todos los valores en el map
        System.out.println(objHashMap.values());

        ArrayList<String> vocales = new ArrayList<String>(); //--> Creamos un ArrayList para agregar las vocales
        vocales.add("a");
        vocales.add("e");
        vocales.add("i");
        vocales.add("o");
        vocales.add("u");

        objHashMap.put("vocales", vocales); //---> Agregamos directamente el arreglo al HashMap
        System.out.println(objHashMap); //Mediante un arreglo podemos agregar varios datos de una vez.

        //Si no encuentra la clave retorna un "Null" --> Diferencia entre mayusculas y minusculas
        System.out.println(objHashMap.get("vocales"));

        //BUSCAR COMO RECORRER UN HASHMAP

        //recorrer el HashMap con un for
        for(Object clave : objHashMap.keySet()){ //-->No se acostumbra usar la clase objeto, salvo en alguna circunstancias
            System.out.println("clave: "+clave +" - valor: "+objHashMap.get(clave));
        }


    }
}
