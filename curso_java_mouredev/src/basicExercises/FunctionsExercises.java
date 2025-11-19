package basicExercises;

import java.util.ArrayList;

public class FunctionsExercises {
    public static void main(String[] args) {

        System.out.println("-----------Ejercicio 1-----------");
        holajava();

        System.out.println("-----------Ejercicio 2-----------");
        saludo("Fer");

        System.out.println("-----------Ejercicio 3-----------");
        System.out.println( resta(5,3));

        System.out.println("-----------Ejercicio 4-----------");
        System.out.println(cuadrado(5));

        System.out.println("-----------Ejercicio 5-----------");
        System.out.println(even(4));

        System.out.println("-----------Ejercicio 6-----------");
        System.out.println(isAdult(18));

        System.out.println("-----------Ejercicio 7-----------");
        System.out.println(length("Hola Fer"));

        System.out.println("-----------Ejercicio 8-----------");
        int[] test1 = {5,10,15};
        System.out.println(average(test1));

        System.out.println("-----------Ejercicio 9-----------");
        System.out.println(factorial(5));

        System.out.println("-----------Ejercicio 10-----------");
        ArrayList<String> names = new ArrayList<>();
        names.add("Ana");
        names.add("Fer");
        names.add("Mama");
        System.out.println(showStrings(names));
    }


    // 1. Crea una función que imprima "¡Te doy la bienvenida al curso de Java desde cero!".
    public static void holajava(){
        System.out.println("¡Te doy la bienvenida al curso de Java desde cero!");
    }

    // 2. Escribe una función que reciba un nombre como parámetro y salude a esa persona.
    public static void saludo(String name){
        System.out.println("!Hola " + name +"¡");
    }

    // 3. Haz un método que reciba dos números enteros y devuelva su resta.
    public static Integer resta(int a, int b){
        int resultado = a-b;
        return resultado;
    }

    // 4. Crea un método que calcule el cuadrado de un número (n * n).
    public static double cuadrado(double num){
        return num * num;
    }

    // 5. Escribe una función que reciba un número y diga si es par o impar.
    public static String even(int num2){
        if(num2 % 2 == 0){
            return "Es un número par";
        }
        return "Es un número impar";
    }

    // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).
    public static boolean isAdult(int num3){
        if(num3 >= 18){
            return true;
        }
        return false;
    }

    // 7. Implementa una función que reciba una cadena y retorne su longitud.
    public static Integer length(String chain){
       int longitud = 0;
       for(char c : chain.toCharArray()){
           longitud ++;
       }
       return longitud;
    }

    //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.
    public static double average(int []numbers){
        int sum=0;
        for(int number : numbers){
            sum += number;
        }
        double average = (sum)/(numbers.length);
        return average;
    }

    // 9. Escribe un método que reciba un número y retorna su factorial.
    public static Double factorial(int num4){
        double resultado=1;
        for (int i = 1; i <= num4; i++){
            resultado *= i ;
        }

        return resultado;
    }
    

    // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.
    public static StringBuilder showStrings(ArrayList<String> lista){
        StringBuilder resultado = new StringBuilder();

        for(String str : lista){
            //System.out.println(str);
            resultado.append(str+ "\n");
        }
        return resultado;
    }


}
