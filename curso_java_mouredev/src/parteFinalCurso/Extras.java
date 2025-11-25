package parteFinalCurso;

import OOP.*;

import java.util.Scanner;

public class Extras {

    static String globalName = "Fer";

    public static void main(String[] args) {

        // Extras

        // null

        String name = "Fernando";
        name = null;
        if(name != null){
            System.out.println(name.toLowerCase());
        }

        // - import

        new Person("Fernando",27);

        // - Scanner

        var scanner = new Scanner(System.in);
        System.out.println("Introduce tu edad: ");
        var age = scanner.nextInt();

        System.out.println("La edad es: " + age);


        // - Scope : variables globales y locales
        test();


        // - Static




    }

    public static void test(){
        System.out.println(globalName);
    }
}
