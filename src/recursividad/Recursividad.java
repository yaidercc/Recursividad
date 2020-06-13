/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividad;

/**
 *
 * @author CcordobaaR
 */
public class Recursividad {

    //se usa tipo long por que tiene mas capacidad que un entero
    public static long factorial2(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    //para contrlar las exceciones el factorial, se pone un try, catch, en  un metdo privado
    private static long factorial(int n) {
        if (n >= 0) {
            return factorial2(n);
        }
        throw new IllegalArgumentException();
    }

    // decreciente desde n hasta 1
    public static void decreciente(int n) {
        if (n > 0) {
            System.out.println(n);
            decreciente(n - 1);
        } else {

        }
    }

    // creciente desde 1 hassta n
    public static void creciente(int n, int t) {
        if (t <= n) {
            System.out.println(t);
            creciente(n, t + 1);
        }
    }

    // impares entre 2 numeros
    public static void impares(int li, int ls) {
        if (li == ls) {
            if (li % 2 != 0) {
                System.out.println(li);
            }

        } else {
            if (li % 2 != 0) {
                System.out.println(li);
            }
            impares(li + 1, ls);
        }
    }

    // sumatoria decreciente
    public static int sumardesc(int li, int ls) {
        if (li == ls) {
            return 1;
        } else {
            return ls + sumardesc(li, ls - 1);
        }
    }

    // sumatoria creciente entre a y b
    public static int sumarasc(int li, int ls) {
        if (ls == li) {
            return 1;
        } else {
            return ls + sumarasc(li + 1, ls);
        }
    }

    // numero primo, que tiene 2 divisores (
    public static boolean esPrimo2(int n, int i) {
        if (i < n) {
            if (n % i == 0) {
                return false;

            } else {
                return esPrimo2(n, i + 1);
            }
        }
        return true;

    }

    private static boolean esPrimo(int n, int i) {
        if (n > 1) {
            return esPrimo2(n, i + 1);
        } else {
            return false;
        }
    }
    // en los metodos de vector siempre necesito un indice

    public static double sumarDatos(int i, double[] vector) {
        if (i < vector.length) {
            return vector[i] + sumarDatos(i + 1, vector);
        }
        return 0;
    }

    private static double sumar(double[] vector) {
        return sumarDatos(0, vector);
    }

    public static double mayor(int i, double[] vector, double max) {
        if (i != vector.length - 1) {
            if (vector[i] > max) {
                max = mayor(i + 1, vector, vector[i]);
            } else {
                max = mayor(i + 1, vector, max);
            }
        }
        return max;
    }
//---

    public static int datoRepetido(int[] vector, int i, int n) {
        if (i < vector.length - 1) {
            if (vector[i] == n) {
                return 1 + datoRepetido(vector, i + 1, n);
            }
            return datoRepetido(vector, i + 1, n);
        }
        return 0;
    }

    public static int datoRepetido(int[] vector) {
        return datoRepetido(vector, 0, 0);
    }
//----------------------------------------------//

//--- maximo comun multiplo de 2 numeros--------
    public static int MCD(int a, int b, int max) {
        if (b > 0) {
            return 0;
        }
        return 0;
    }
//-----------------------------------------------//

//-------invertir una cadena-----------------
    public static String invertida(String cadena, int i) {
        if (i < cadena.length() - 1) {
            return invertida(cadena, i + 1) + cadena.charAt(i);
        }
        return cadena.charAt(i) + "";
    }
//---------------------------------------------//    

//----- elevar un numero a una potencia--------
    private static double elevar2(double a, int b) {
        //todo numero elevado a la 0 es igual a 1
        if (b == 0) {
            return 1;
        } else {
            //aqui se lleva a cabo la operacion
            return a * elevar(a, b - 1);
        }
    }

    //para evitar que se ingresen datos que dañen el proceso de ejecucion
    public static double elevar(double a, int b) {
        return elevar2(a, b);
    }
//------------------------------------------------//

//------- invertir datos de un vector--------------
    private static int[] invertir(int[] vector, int i) {
        int aux=0;
        if (i < vector.length/2) {
            aux=vector[i];
            vector[i]=vector[vector.length-(i+1)];
            vector[vector.length-(i+1)]=aux;
            return invertir(vector, i + 1);
        } else {
            return vector;
        }
    }

    //para evitar que se ingresen datos que dañen el proceso de ejecucion
    public static int[] invertir(int vector[]) {
        return invertir(vector, 0);
    }
    //-----------------------------------------------//

    //-------- imprmir cadena sin espacios-----------------
    private static String espacios(String cadena, int i, String s) {
        if (i < cadena.length()) {
            //guarda los datos que no sean espacios
            if (cadena.charAt(i) != ' ') {
                //los ingresa en una variable
                s += cadena.charAt(i);
            }
            // iterador
            return espacios(cadena, i + 1, s);
        }
        //retorna la nueva cadena
        return s;
    }

    //para evitar que se ingresen datos que dañen el proceso de ejecucion
    public static String espacios(String cadena) {
        return espacios(cadena, 0, "");
    }
    //-------------------------------------------------------//

    //------verificar si una palabra es palindromo---------//
    private static boolean palindromo(String cadena, int i) {
        int j = 0;
        cadena = espacios(cadena, j, "");
        if (i == cadena.length() - 1) {
            return true;
        } else {
            if (cadena.toLowerCase().charAt(i) == cadena.toLowerCase().charAt(cadena.length() - (i + 1))) {
                return palindromo(cadena, i + 1);
            }
            return false;
        }

    }

    //para vitar que se ingresen datos que dañen el proceso de ejecucion
    public static boolean palindromo(String cadena) {
        return palindromo(cadena, 0);
    }
    //------------------------------------------------------------//

    
    //--------verificar cuantas vocales tiene una palabra--------
    public static int vocales(String palabra) {
        return vocales(palabra, 0);
    }

    private static int vocales(String palabra, int i) {
        String vocal = "aeiou";
        if (i < palabra.length()) {
            if (palabra.charAt(i) == vocal.charAt(0) || palabra.charAt(i) == vocal.charAt(1)
                    || palabra.charAt(i) == vocal.charAt(2) || palabra.charAt(i) == vocal.charAt(3)
                    || palabra.charAt(i) == vocal.charAt(4)) {
                return 1 + vocales(palabra, i + 1);
            }
            return vocales(palabra, i + 1);
        }
        return 0;
    }
    //-----------------------------------------
    
    //----calcular sumatoria de factorial de 1 hasta n------//
    private static long sumatorifact(int n,int i,long fact){
        if(i<=n){
             return fact+sumatorifact(n,i+1,fact*(i+1));
        }else{
            return 0;
        }
        
    }
    public static long sumatoriafact(int n){
        return sumatorifact(n,1,1);
    }
    
   //---------------------------------------
    
   //--------secuencia fibonacci------------
    public static int fibonacci(int n){
        if(n==0 || n==1){
            return n;
        }else{
            return fibonacci(n-1)+ fibonacci(n-2);
        }
    }
    
}
