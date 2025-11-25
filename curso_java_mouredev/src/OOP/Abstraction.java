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

    public static class Bird extends Animal implements Flying, Flying2{
        @Override
        public void sound() {
            System.out.println("Pio Pio");
        }
        @Override
        public void fly() {
            System.out.println("El pajaro está volando");
        }

        @Override
        public void fly2() {

        }
    }

    public static class Bat extends Animal implements Flying, Flying2{ // Implementación múltiple
        @Override
        public void sound() {
            System.out.println("Soy Batman!");
        }
        @Override
        public void fly() {
            System.out.println("El murciélago está volando");
        }

        @Override
        public void fly2() {

        }
    }

    // - Interface

    public interface Flying{
        void fly();
    }

    public interface Flying2{
        void fly2();
    }

}
