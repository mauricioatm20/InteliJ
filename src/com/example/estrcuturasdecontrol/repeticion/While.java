package com.example.estrcuturasdecontrol.repeticion;

public class While {

    public static void main(String[] args) {
        // while (true) {
        //  System.out.println("hola merlos"); bucle infinito

        int contador = 0;

        while (contador < 10) {

            contador++;

            if (contador == 5) {
                break; // break se rompe el bucle

                // si quitamos el if contara hasta 10 porque no tiene el break
                // tanto break  como continue se utilizan para romper el bucle
                //continue se salta el break y contina contando

            }
            System.out.println("valor de contador   " + contador);
        }
    }
}