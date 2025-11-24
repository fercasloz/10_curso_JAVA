package OOP;

public class Herencia {
    public static void main(String[] args) {

    //Herencia

        var animal = new Animal("FerAnimal");
        animal.name="Mi animal";
        animal.eat();

        var dog = new Dog("FerDog");
        var cat = new Cat("FerCat");

        dog.name="Cou";
        dog.eat();

        var bird = new Bird("FerBird");
        bird.name = "Bou Bird";
        bird.eat();
        bird.fly();

    }

    public static class Animal{
        String name;

        public Animal(String name){
            this.name = name;
        }
        public void eat(){
            System.out.println("El animal con nombre " + name +  " está comiendo");
        }
    }

    public static class Dog extends Animal{
        public Dog(String name) {
            super(name);
        }

        @Override
        public void eat(){
            System.out.println("El perro con nombre " + name +  " está comiendo");
        }

    }

    public static class Cat extends Animal{

        public Cat(String name) {
            super(name);
        }
    }

    public static class Bird extends Animal{
        public Bird(String name) {
            super(name);
        }

        public void fly(){
            System.out.println("El pájarao con nombre " + name + " está volando");
        }
    }
}
