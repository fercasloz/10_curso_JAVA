package OOP;

import java.util.ArrayList;

public class PolymorphismExercises {
    public static void main(String[] args) {

        // 1. Crea una clase Animal con el método makeSound(). Luego crea subclases Dog, Cat y Cow que sobrescriban ese método con sonidos diferentes. Llama al método desde una lista de Animal.
        System.out.println("----------------Ejercicio 1----------------");
        var dog = new Dog5();
        var cat = new Cat5();
        var cow = new Cow5();

        ArrayList<Animal5> misAnimales = new ArrayList<>();
        misAnimales.add(dog);
        misAnimales.add(cat);
        misAnimales.add(cow);


        for(Animal5 an : misAnimales){
            an.makeSound();
        }

        // 2. Crea una clase Shape con el metodo calculateArea(). Luego implementa subclases Circle y Rectangle con sus propias fórmulas. Usa una lista de Shape para recorrer e imprimir el área de varias figuras.
        System.out.println("----------------Ejercicio 2----------------");
        ArrayList<Shape5> misShapes = new ArrayList<>();
        misShapes.add(new Circle5(4));
        misShapes.add(new Rectangule5(4,5));
        for(Shape5 shape : misShapes){
            shape.calculateArea();
        }


        // 3. Crea una clase Printer con varios métodos print() sobrecargados que acepten diferentes tipos de parámetros (String, int, double). Llama a cada uno desde main.
        System.out.println("----------------Ejercicio 3----------------");
        var printer = new Printer5();
        printer.print(4);
        printer.print("Hola como estás");
        printer.print(5.0);


        // 4. Crea una clase Greeter con dos métodos greet(): uno que salude con “Hello”, y otro que reciba un nombre y salude con “Hello, [nombre]”.
        System.out.println("----------------Ejercicio 4----------------");
        var myGreet = new Greeter5();
        myGreet.greet();
        myGreet.greet("Fernando");

        // 5. Crea una clase Vehicle con un metodo start(). Luego crea Car, Bike y Truck que sobrescriban ese metodo. Recorre una lista ArrayList<Vehicle> para llamar a start() en cada uno.
        System.out.println("----------------Ejercicio 5----------------");
        ArrayList<Vehicule5> myVehicules = new ArrayList<>();
        myVehicules.add(new Car5());
        myVehicules.add(new Bike5());
        myVehicules.add(new Truck5());

        for (Vehicule5 vehicule : myVehicules){
            vehicule.start();
        }

        // 6. Crea una clase Notification con metodo send(), y subclases EmailNotification, SMSNotification. Luego crea una función sendNotification(Notification n) que reciba cualquier tipo y lo ejecute.

        // 7. Crea una función showAnimalType(Animal animal) que imprima el tipo de animal. Pasa diferentes subclases (Dog, Cat, Horse) para que cada una imprima su tipo con su propio getType() sobrescrito.

        // 8. Crea una clase Converter con métodos convert(int), convert(double), y convert(String) que devuelvan diferentes formatos de texto.

        // 9. Crea una clase Product con el metodo getPrice(). Luego, Book y Electronic deben sobrescribirlo con su propia lógica de descuento. Recorre una lista de Product e imprime el precio final de cada uno.

        // 10. Crea una clase Character con metodo attack(). Luego crea subclases Warrior, Archer, Mage con ataques diferentes. En main, crea un array de Character y llama a attack() para cada uno.
    }
}

abstract class Vehicule5{
    public void start(){}
}
class Car5 extends Vehicule5{
    @Override
    public void start() {
        System.out.println("El coche ha arrancado");
    }
}
class Bike5 extends Vehicule5{
    @Override
    public void start() {
        System.out.println("La moto ha arrancado");
    }
}
class Truck5 extends Vehicule5{
    @Override
    public void start() {
        System.out.println("El camión ha arrancado");
    }
}


class Greeter5{
    public void greet(){
        System.out.println("Hello");
    }
    public void greet(String name){
        System.out.println("Hello " + name);
    }
}



class Printer5{
    public Printer5(){}
    public void print(String param){
        System.out.println("El valor imprimido es un String con valor : " + param);
    }
    public void print(double param){
        System.out.println("El valor imprimido es un double con valor : " + param);
    }
    public void print(int param){
        System.out.println("El valor imprimido es un Integer con valor : " + param);
    }
}


abstract class Shape5{
    public void calculateArea(){}
}

class Circle5 extends Shape5{
    double radius;
    public Circle5(double radius){
        this.radius = radius;
        System.out.println("Ha creado un circulo");
    }
    @Override
    public void calculateArea() {
        System.out.println("El area del círculo es " + ((this.radius*this.radius) * Math.PI));
    }
}

class Rectangule5 extends Shape5{
    double minorSide, maxSide;
    public Rectangule5(double minor, double max){
        minorSide=minor;
        maxSide=max;
        System.out.println("Ha creado un rectángulo");
    }
    @Override
    public void calculateArea() {
        System.out.println("El area del rectángulo es " + (minorSide * maxSide));
    }
}


abstract class Animal5{
    public void makeSound(){}
}

class Dog5 extends Animal5{
    @Override
    public void makeSound(){
        System.out.println("Guau");
    }
}

class Cat5 extends Animal5{
    @Override
    public void makeSound(){
        System.out.println("Miau");
    }
}

class Cow5 extends Animal5{
    @Override
    public void makeSound(){
        System.out.println("Muuuuuu");
    }
}