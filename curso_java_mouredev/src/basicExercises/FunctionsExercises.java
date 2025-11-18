package basicExercises;

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

        System.out.println("-----------Ejercicio 6-----------");

        System.out.println("-----------Ejercicio 7-----------");

        System.out.println("-----------Ejercicio 8-----------");

        System.out.println("-----------Ejercicio 9-----------");

        System.out.println("-----------Ejercicio 10-----------");
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

    // 6. Crea un método que reciba una edad y retorne true si es mayor de edad (y false en caso contrario).

    // 7. Implementa una función que reciba una cadena y retorne su longitud.

    //  8. Crea un método que reciba un array de enteros, calcula su media y lo retorna.

    // 9. Escribe un método que reciba un número y retorna su factorial.

    // 10. Crea una función que reciba un ArrayList<String> y lo recorra mostrando cada elemento.

    ---> 5:31:49

}
