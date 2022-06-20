package com.generation.f20220531.manager;

import com.generation.f20220530.Alumno;
import com.generation.f20220531.Cliente;

import java.util.List;

//las clases manager o factory sirven para validar la logica de negocios
public class ClienteManager {

    //Funcion que permita recorrer el arreglo e imprima

    public void recorrerArregloCliente(List<Cliente> listaClientes) {
        for (Cliente cliente: listaClientes) {
            System.out.println(cliente.toString());

        }

    }


}
