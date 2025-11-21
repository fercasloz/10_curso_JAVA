package basicExercises;

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        System.out.println("--------Ejercicio 1--------");
        int edad = 18;
        if(edad >= 18){
            System.out.println("El usuario puede votar porque tiene " + edad + " años");
        }else{
            System.out.println("El usuario no puede votar porque tiene " + edad + " años");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.
        System.out.println("--------Ejercicio 2--------");
        int num1 = 10;
        int num2 = 10;
        if(num1 > num2){
            System.out.println(num1 + " es mayor que " + num2);
        }else if(num2 > num1){
            System.out.println(num2 + " es mayor que " + num1);
        }else{
            System.out.println("Los números son iguales");
        }

        // 3. Dado un número, verifica si es positivo, negativo o cero.
        System.out.println("--------Ejercicio 3--------");
        int num3 = 6;
        if(num3 > 0){
            System.out.println("El número es positivo");
        } else if (num3 < 0) {
            System.out.println("El número es negativo");
        }else{
            System.out.println("El número es cero");
        }

        // 4. Crea un programa que diga si un número es par o impar.
        System.out.println("--------Ejercicio 4--------");
        int num4 = 2;
        if(num4 % 2 == 0){
            System.out.println("El numero es par");
        }else{
            System.out.println("El número es impar");
        }

        // 5. Verifica si un número está en el rango de 1 a 100.
        System.out.println("--------Ejercicio 5--------");
        int num5 = 103;
        if(num5 >= 1 && num5 <= 100){
            System.out.println("El numero está en el rango entre 1 y 100");
        }else{
            System.out.println("El numero no está en el rango entre 1 y 100");
        }


        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.
        System.out.println("--------Ejercicio 6--------");
        int dayWeek = 3;
        switch (dayWeek){
            case 1:
                System.out.println("El día es lunes");
                break;
            case 2:
                System.out.println("El día es martes");
                break;
            case 3:
                System.out.println("El día es miércoles");
                break;
            case 4:
                System.out.println("El día es jueves");
                break;
            case 5:
                System.out.println("El día es viernes");
                break;
            case 6:
                System.out.println("El día es sábado");
                break;
            case 7:
                System.out.println("El día es domingo");
                break;
        }

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).
        System.out.println("--------Ejercicio 7--------");
        int nota = 88;
        if (nota >= 85){
            System.out.println("Enhorabuena has sacado un sobresaliente!! Con una nota de " + nota + "/100");
        }else if(nota >= 50){
            System.out.println("Has aprobado!! Con una nota de " + nota + "/100");
        }else{
            System.out.println("Has suspendido. Con una nota de " + nota + "/100");
        }

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.
        System.out.println("--------Ejercicio 8--------");
        int edadUser = 14;
        boolean acompañado = true;

        if(edadUser >= 15 || acompañado == true){
            System.out.println("Puede entrar al cine");
        }else{
            System.out.println("No puede entrar al cine");
        }

        // 9. Crea un programa que diga si una letra es vocal o consonante.
        System.out.println("--------Ejercicio 9--------");
        char letra = 'c';
        switch (letra){
           case 'a':
                System.out.println("Es vocal");
                break;
           case 'e':
                System.out.println("Es vocal");
                break;
           case 'i':
                System.out.println("Es vocal");
                break;
           case 'o':
                System.out.println("Es vocal");
                break;
           case 'u':
                System.out.println("Es vocal");
                break;
           default:
                System.out.println("Es consonante");
        }

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.
        System.out.println("--------Ejercicio 10--------");
        int a = 14;
        int b = 6;
        int c = 3;
        
        if (a > b && a > c){
            System.out.println("a es mayor que b y c");
        } else if (b > a && b > c) {
            System.out.println("b es mayor que a y c");
        } else if (c > a && c > b) {
            System.out.println("c es mayor que a y b");
        } else {
            System.out.println("Hay dos que son iguales");
        }
    }
}
