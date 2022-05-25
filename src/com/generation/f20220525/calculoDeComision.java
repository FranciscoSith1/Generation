package com.generation.f20220525;

import java.util.Scanner;

public class calculoDeComision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int primeraComision = 10;
        int segundaComision = 20;
        int terceraComision = 30;

        System.out.println("Ingrese el monto de la venta");
        int montoDeVenta = sc.nextInt();


//punto critico para seguir la operación
        if (montoDeVenta <= 0) {
            System.out.println("Error en el ingreso de datos, la venta debe ser mayor a 0");
        } else {
//si montoDeVenta esta entre 1 y 1000 n/a
            if (montoDeVenta >= 1 && montoDeVenta <= 1000) {
                System.out.println("Sin comision");
            }
            if (montoDeVenta >= 1001 && montoDeVenta <= 4999) {
                System.out.println("El monto de la comisión es: " + (((montoDeVenta * primeraComision) / 100)));
            }
            if (montoDeVenta == 5000){
                System.out.println("Este monto no está considerado para comisión");
            }
            if (montoDeVenta >= 5001 && montoDeVenta <= 9999) {
                System.out.println("El monto de la comisión es: " + (((montoDeVenta * segundaComision) / 100)));
            }
            if (montoDeVenta >= 10000) {
                System.out.println("El monto de la comisión es: " + (((montoDeVenta * terceraComision) / 100)));
            }

        }

    }
}