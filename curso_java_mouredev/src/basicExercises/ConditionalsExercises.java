package basicExercises;

public class ConditionalsExercises {

    public static void main(String[] args) {

        // 1. Establece la edad de un usuario y muestra si puede votar (mayor o igual a 18).
        int edad = 18;
        if(edad >= 18){
            System.out.println("El usuario puede votar porque tiene " + edad + " años");
        }else{
            System.out.println("El usuario no puede votar porque tiene " + edad + " años");
        }

        // 2. Declara dos números y muestra cuál es mayor, o si son iguales.

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

        // 4. Crea un programa que diga si un número es par o impar.

        // 5. Verifica si un número está en el rango de 1 a 100.

        // 6. Declara una variable con el día de la semana (1-7) y muestra su nombre con switch.

        // 7. Simula un sistema de notas: muestra "Sobresaliente", "Aprobado" o "Suspenso" según la nota (0-100).

        // 8. Escribe un programa que determine si puedes entrar al cine: debes tener al menos 15 años o ir acompañado.

        // 9. Crea un programa que diga si una letra es vocal o consonante.

        // 10. Usa tres variables a, b, c y muestra cuál es el mayor de las tres.

    }
}
