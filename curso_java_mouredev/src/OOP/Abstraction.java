package OOP;

public class Abstraction {

    public static void main(String[] args) {

        // Abstracción

        // - Clase Abstracta

        var dog = new Dog();
        dog.sleep();
        dog.sound();

        var cat = new Cat();
        cat.sleep();
        cat.sound();

        // - Interface
    }





    // - Clase abstracta

    public static abstract class Animal{

        public abstract void sound();

        public void sleep(){
            System.out.println("El animal está durmiendo");
        }
    }

    public static class Dog extends Animal{
        @Override
        public void sound() {
            System.out.println("Guau");
        }

        @Override
        public void sleep(){
            System.out.println("El perro está durmiendo");
        }
    }

    public static class Cat extends Animal{
        @Override
        public void sound() {
            System.out.println("Miau");
        }

        @Override
        public void sleep(){
            System.out.println("El gato está durmiendo");
        }
    }

}
