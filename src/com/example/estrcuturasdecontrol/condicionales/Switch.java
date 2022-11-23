package com.example.estrcuturasdecontrol.condicionales;

public class Switch {

    public static void main(String[] args) {

        String dia = "viernes";

        switch (dia) {
            case "lunes":

                System.out.println("hoy es lunes animo");
                break; // break se utiliza para romper el curso de ejecucion

            case "martes":
                System.out.println("hoy es martes animo");
                break;
            case "miercoles":
                System.out.println("hoy es miercoles animo");
                break;

            case "jueves":
                System.out.println("hoy es jueves animo");
                break;
                default:
                    System.out.println("hoy no es dia valido");



        }
    }
}
