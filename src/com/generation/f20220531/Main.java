package com.generation.f20220531;

import com.generation.f20220531.manager.ClienteManager;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Arreglo de clientes
        List<Cliente> listaClientes = new ArrayList<Cliente>();
        int opcion = 0;

        //ACCESADORES - MODIFICADORES
        //instancia de cliente

        /*Cliente cliente = new Cliente(); //CUANDO NO PONEMOS CONSTRUCTOR, POR DEFECTO VIENE UNO VACIO
        cliente.setNombre("Francisco");
        cliente.setRut("19.569.225-6");
        cliente.setId(15458);*/

        do {
            //EXCEPCIONES
            Cliente clienteDatosDinamicos = new Cliente();

            System.out.println("Ingrese el ID de Cliente");
            //Integer id = sc.nextInt();
            String idString = sc.nextLine();

            try { //Es como una especie de if, si no funciona lo primero, se salta a lo segundo
                Integer id = Integer.parseInt(idString);
                clienteDatosDinamicos.setId(id);

                System.out.println("Ingrese el nombre de Cliente");
                String nombre = sc.nextLine();
                clienteDatosDinamicos.setNombre(nombre);

                System.out.println("Ingrese el rut de Cliente");
                String rut = sc.nextLine();
                clienteDatosDinamicos.setRut(rut);

                System.out.println("Ingrese el correo de Cliente");
                String correo = sc.nextLine();
                clienteDatosDinamicos.setCorreo(correo);

                //Integer division = 100 / 0;
                //System.out.println(division);

            } catch (ArithmeticException ae) {
                System.out.println("Error al dividir por cero");
            } catch (NullPointerException npe) {
                System.out.println("No se puede realizar la operacion matematica, un dato es nulo");
            } catch (InputMismatchException ime) {
                System.out.println("Error en el ingreso de un dato");
            } catch (NumberFormatException nfe) {
                System.out.println("No puede ingresar un letra como identificador " + nfe);
            } catch (Exception e) {
                System.out.println("Ha ocurrido un error, contecte al administrador " + e);
            }
            //NullPointerException ---> error cuando el valor el null

            listaClientes.add(clienteDatosDinamicos); //Agregando el cliente a la lista

            System.out.println("¿Desea ingresa un nuevo cliente? (1) SI (0) NO");
            opcion = sc.nextInt();
            sc.nextLine();

        } while (opcion == 1);

        /**acceder al metodo de ota clase**/
        //instancia de la clase
        ClienteManager cm = new ClienteManager();
        cm.recorrerArregloCliente(listaClientes);
       

    }
}
