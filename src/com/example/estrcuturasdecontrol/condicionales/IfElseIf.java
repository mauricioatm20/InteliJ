package com.example.estrcuturasdecontrol.condicionales;

public class IfElseIf {

    public static void main(String[] args) {

        String dia = "sabado";

        boolean resultado = dia.equals("martes");
        boolean resultadocomparadornum = 5 == 5;
        // el == se utiliza para comparar numeros y equals para strings (palabras)


        if (dia.equals("Lunes")) {
            System.out.println("animo con la semana");

        } else if (dia.equals("Martes")) {
            System.out.println("martes animo");

        } else if (dia.equals("miercoles")) {
            System.out.println("mitad");

        } else if (dia.equals("jueves")) {
            System.out.println("pre finde");

        } else if (dia.equals("viernes")) {
            System.out.println("finde");
        }else {
            System.out.println("el dia introducido no es valido");

        }
    }
}