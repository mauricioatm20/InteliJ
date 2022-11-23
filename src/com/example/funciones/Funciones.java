package com.example.funciones;

public class Funciones {

    public static void main(String[] args) {


        // opcion1 : funcion sin parametros y sin tipo de retorno

        showmenu();
        String menu = getMenu();
        System.out.println(menu);

        System.out.println("bienvenidos");
        System.out.println("ver zapatillas ");
        System.out.println("comprar zapatillas");
        System.out.println("salir");

    }

    static void showmenu(){

    }

// como se crean las funciones: tiene un identificador seguido de un parentesis punto y coma
        // void es una palabra reservada que no devuelve nada
        // static para poder imvocar a una funcion tiene que tener static
        //static void menu();


    // opcion 2 : funcion sin parametro pero con retorno

    //para guardar get menu y no de error podemos imprimirlo con sout o escribiendo String menu = getmenu();

//opcion 3: funcion con parametro y sin tipo de retorno

    //opcion 4 con funcion y con tipo de retorno

    String nombre ="alan";
    String apellidos = "sastre";
    String saludo = obtenersaludo(nombre, apellidos);


    static String obtenersaludo(String nombre, String apellidos){
        return "buenas tardes " + nombre + apellidos;


    }



    static String getMenu() {

        return "ver zapatilas: \n 1 compar zapatilla.....";

        // (\n) y numero salta la linea



    }


    static void imprimirsaludobuenosdias(String nombre) {
        System.out.println("buenas tardes"+ nombre);

    }



}
