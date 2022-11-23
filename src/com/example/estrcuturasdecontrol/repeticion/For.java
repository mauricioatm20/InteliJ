package com.example.estrcuturasdecontrol.repeticion;

public class For {

    public static void main(String[] args) {

        for(int i = 0; i < 20; i++) {
           // System.out.println(i); (el valor de i es : "+i)

        }

        String[] nombres = {"pepe", "juanito", "genis"};
        for (int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);

        }

        int suma =0;
        int[] numeros = {5,7,8};
        for (int i = 0; i < numeros.length; i++){
            //suma = suma + numeros [i];
            suma = suma + numeros[i];  // += es llo que mismo que (suma +)

        }

}

}
