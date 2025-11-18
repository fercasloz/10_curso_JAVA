package basicExercises;

import java.sql.Array;
import java.util.*;

public class LoopsExercises {
    public static void main(String[] args) {

        // 1. Imprime los números del 1 al 10 usando while.
        System.out.println("-----------EJERCICIO 1-----------");
        int num = 1;
        while(num <= 10){
            System.out.println(num);
            num++;
        }

        // 2. Usa do-while para mostrar todos los valores de un ArrayList.
        System.out.println("-----------EJERCICIO 2----------");
        ArrayList<String> miArray = new ArrayList<>();

        miArray.add("uno");
        miArray.add("dos");
        miArray.add("tres");
        miArray.add("cuatro");

        int i = 0;
        do{
            System.out.println(miArray.get(i));
            i ++;
        }while(i<miArray.size());

        // 3. Imprime los múltiplos de 5 del 1 al 50 usando for.
        System.out.println("-----------EJERCICIO 3-----------");
        for(int j = 1; j <= 100; j++){
            if(j % 5 == 0){
                System.out.println(j);
            }
        }

        // 4. Recorre un Array de 5 números e imprime la suma total.
        System.out.println("-----------EJERCICIO 4-----------");
        int [] numeros = {4,5,6,10};
        int suma = 0;
        for (int a = 0; a < numeros.length; a++){
            suma = suma + numeros[a];
        }
        System.out.println(suma);
        //System.out.print("\n");

        // 5. Usa un for para recorrer un Array y mostrar sus valores.
        System.out.println("-----------EJERCICIO 5-----------");
        String[] users = {"Ana", "Juan", "Ana Maria", "Fernando", "Angel", "Maria Jose"};

        for(String user : users){
            System.out.println(user);
        }

        // 6. Usa for-each para recorrer un HashSet y un HashMap.

        System.out.println("-----------EJERCICIO 6.1-----------");
        Set <String> names = new HashSet<>();
        names.add("Ana");
        names.add("Fernando");
        names.add("Hola");
        names.add("Fernando");

        for (String name:names){
            System.out.println(name);
        }

        System.out.println("-----------EJERCICIO 6.2-----------");
        Map<String, Integer> edades = new HashMap<>();
        edades.put("Ana",24);
        edades.put("Fernando",27);
        edades.put("Hola",999);

        for(Map.Entry<String, Integer> edad : edades.entrySet()){
            System.out.println(edad.getKey() + " ---> " + edad.getValue());
        }

        // 7. Imprime los números del 10 al 1 (descendiente) con un bucle for.
        System.out.println("-----------EJERCICIO 7-----------");
        for (int b = 10; b >= 1; b--){
            System.out.println(b);
        }


        // 8. Usa continue para saltar los múltiplos de 3 del 1 al 20.
        System.out.println("-----------EJERCICIO 8-----------");

        for(int c = 1 ; c <= 20; c++){
            if(c % 3 == 0){
                continue;
            }
            System.out.println(c);
        }

        // 9. Usa break para detener un bucle cuando encuentres un número negativo en un array.
        System.out.println("-----------EJERCICIO 9-----------");
        int[] negativos = {5,4,3,-1,5,6};
        for(int num8 : negativos){
            if (num8 >= 0){
                System.out.println(num8);
            }else {
                break;
            }
        }
        // 10. Crea un programa que calcule el factorial de un número dado.
        System.out.println("-----------EJERCICIO 10-----------");
    }
}
