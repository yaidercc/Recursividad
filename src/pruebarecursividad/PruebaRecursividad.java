/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebarecursividad;

import recursividad.Recursividad;

/**
 *
 * @author CcordobaaR
 */
public class PruebaRecursividad {

    public static void main(String[] args) {
        Recursividad recu = new Recursividad();

        System.out.println("***Factorial***");
        System.out.println(recu.factorial2(4));

        System.out.println("***Imprimir forma creciente***");
        recu.creciente(5, 1);

        System.out.println("***Imprimir forma decreciente***");
        recu.decreciente(6);

        System.out.println("***Imprimir impares***");
        recu.impares(1, 11);

        System.out.println("***sumatoria***");
        int a = recu.sumarasc(1, 2);
        System.out.println(a);

        System.out.println("***Imprimir primo***");
        System.out.println(recu.esPrimo2(4, 2));

        double[] vector = {34, 36, 999, 9};
        System.out.println("***Imprimir suma***");
        double suma = recu.sumarDatos(0, vector);
        System.out.println(suma);

        System.out.println("***Imprimir mayor***");
        System.out.println(recu.mayor(0, vector, 0));

        System.out.println("***Imprimir cadena");
        System.out.println(recu.invertida("casa", 0));

        //potencia de un numero
        System.out.println("***numero elevado***");
        System.out.println(recu.elevar(1.5, 2));

        System.out.println("****palindromo****");
        if (recu.palindromo("Amo la pacifica paloma")) {
            System.out.println("es palindromo");
        } else {
            System.out.println("no es palindromo");
        }

        System.out.println("******palabra sin espacios*****");
        System.out.println(recu.espacios("anita lava la tina"));

        int j[] = {4, 1, 3, 2};
        
        recu.invertir(j);

        try {
            recu.burbuja(j);
        } catch (Exception e) {
            System.out.println("que paso menor?");
        }

        for (int i = 0; i < j.length; i++) {
            System.out.println("vector ordenado:  " + j[i]);

        }
        System.out.println(recu.vocales("yaider"));

        System.out.println("recursividad: " + recu.sumatoriafact(4));

        System.out.println("fibonacci: " + recu.fibonacci(3));
        
         System.out.println("que valores coinciden: " + recu.coincide(j));

    }
}
