package com.generation.f20220530;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Alumno> listaAlumnos = new ArrayList<Alumno>();

        // instancia de una clase
        Alumno alumno = new Alumno(); //el constructor permite asignar valores a los atributos
        Alumno alumno2 = new Alumno("Francisco", "Cid", 25, "G1");
        Alumno alumno01 = new Alumno("Luis", "Mejias", 28, "G1");
        Alumno alumno02 = new Alumno("Leonardo", "Utreras", 26, "G1");
        Alumno alumno03 = new Alumno("Mary", "Aedo", 18, "G1");
        Alumno alumno04 = new Alumno("Francisco", "Perez", 26, "G1");
        Alumno alumno05 = new Alumno("Francisco", "Cid", 25, "G1");
        Alumno alumno06 = new Alumno("Ignacio", "Romero", 23, "G1");

        listaAlumnos.add(alumno01);
        listaAlumnos.add(alumno02);
        listaAlumnos.add(alumno03);
        listaAlumnos.add(alumno04);
        listaAlumnos.add(alumno05);
        listaAlumnos.add(alumno06);

        for (int i = 0; i < listaAlumnos.size(); i++){
            System.out.println(listaAlumnos.get(i).getNombre());
            System.out.println(listaAlumnos.get(i).getApellido());
        }

        System.out.println("******");
        for (Alumno objetoAlumno: listaAlumnos) {
            System.out.println(objetoAlumno.getNombre());
            System.out.println(objetoAlumno.getApellido());
            System.out.println(objetoAlumno.toString());
        }

        //getter ---> permite obtener el valor del atributo
        //System.out.println(alumno.getNombre());
        //System.out.println(alumno2.getNombre());

        //setter ---> permite cambiar o asignar un valor al atributo
        //alumno.setNombre("Rebeca");
        //System.out.println(alumno.getNombre());

        //Alumno alumno05 = new Alumno("Francisco","Cid",25,"G1");

        /*System.out.println("****** Menú del Equipo 1 ******");
        System.out.println("* " + alumno01.getApellido() + ", " + alumno01.getNombre() + ", " + alumno01.getEdad() + " años, " + alumno01.getCurso());
        System.out.println("* " + alumno02.getApellido() + ", " + alumno02.getNombre() + ", " + alumno02.getEdad() + " años, " + alumno02.getCurso());
        System.out.println("* " + alumno03.getApellido() + ", " + alumno03.getNombre() + ", " + alumno03.getEdad() + " años, " + alumno03.getCurso());
        System.out.println("* " + alumno04.getApellido() + ", " + alumno04.getNombre() + ", " + alumno04.getEdad() + " años, " + alumno04.getCurso());
        System.out.println("* " + alumno05.getApellido() + ", " + alumno05.getNombre() + ", " + alumno05.getEdad() + " años, " + alumno05.getCurso());
        System.out.println("* " + alumno06.getApellido() + ", " + alumno06.getNombre() + ", " + alumno06.getEdad() + " años, " + alumno06.getCurso());
        System.out.println("*******************************");

        System.out.println(" ");
        System.out.println(alumno05.toString()); //---> el .toString genera un String con los datos del objeto.*/


    }
}
