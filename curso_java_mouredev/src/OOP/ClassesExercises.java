package OOP;

import java.util.ArrayList;

public class ClassesExercises {
    public static void main(String[] args) {

        // 1. Crea una clase Book con atributos title y author. Crea un objeto y muestra sus datos.
        System.out.println("---------------Ejercicio 1---------------");
        Book book = new Book("Cien años de soledad","Stephen");
        book.showBook();


        // 2. Crea una clase Dog con un método bark() que imprima su sonido.
        System.out.println("---------------Ejercicio 2---------------");
        Dog dog = new Dog();
        dog.bark();

        // 3. Añade un constructor a la clase Book que reciba title y author.
        System.out.println("---------------Ejercicio 3---------------");
        Book book1 = new Book("Harry Potter","Fernando");
        book1.showBook();

        // 4. Crea una clase Car con atributos brand y model y un método showData().
        System.out.println("---------------Ejercicio 4---------------");
        Car ibiza = new Car("SEAT","Ibiza");
        ibiza.showData();


        // 5. Crea una clase Student con atributo score y un método que diga si aprobó (mayor o igual a 60).
        System.out.println("---------------Ejercicio 5---------------");
        Student student1 = new Student(65);
        Student student2 = new Student(45);
        System.out.println(student1.isPass());
        System.out.println(student2.isPass());

        // 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
        System.out.println("---------------Ejercicio 6---------------");
        BankAccount cuenta1 = new BankAccount(5000);
        BankAccount cuenta2 = new BankAccount(5000);
        cuenta1.deposit(5000);
        cuenta1.showBalance();
        cuenta2.deposit((-2000));
        cuenta2.showBalance();

        // 7. Crea una clase Rectangle con métodos para calcular el área y el perímetro.
        System.out.println("---------------Ejercicio 7---------------");
        Rectangle rectangulo = new Rectangle(5,10);
        System.out.println("El área del rectángulo es " + rectangulo.getArea());
        System.out.println("El perímetro del rectángulo es " + rectangulo.getPerimeter());

        // 8. Crea una clase Worker que reciba nombre y salario, y un método para mostrar su salario.
        System.out.println("---------------Ejercicio 8---------------");
        Worker worker1 = new Worker("Fernando",3500);
        worker1.showSalario();

        // 9. Crea varios objetos Person y guárdalos en un ArrayList.
        System.out.println("---------------Ejercicio 9---------------");
        ArrayList<Person2> personas = new ArrayList<>();
        personas.add(new Person2("Fernando"));
        personas.add(new Person2("Ana"));
        personas.add(new Person2("Thor"));

        for(Person2 p : personas){
            System.out.println(p.getName());
        }

        // 10. Crea una clase Product y un método que aplique un descuento sobre su precio.
        System.out.println("---------------Ejercicio 10---------------");
        Product producto = new Product("iPhone",1000);
        System.out.println(producto.showProduct());
        producto.discount(25);
        System.out.println(producto.showProduct());

    }
}



class Book{
    String title, author;
    public Book(String title, String author){
        this.title=title;
        this.author=author;
    }
    void showBook(){
        System.out.println("Este libro es : " + title + " y es de " + author);
    }
}

class Dog{
    void bark(){
        System.out.println("Guau Guau!");
    }
}

class Car{
    String brand,model;
    public Car(String brand, String model){
        this.brand=brand;
        this.model=model;
    }
    void showData(){
        System.out.println("El coche es de la marca " + brand + " y es el modelo " + model);
    }
}

class Student{
    int score;
    public Student(int score){
        this.score=score;
    }
    public String isPass(){
        if(this.score>=60){
            return "El estudiante ha aprobado";
        }
        return "El estudiante no ha aprobado";
    }
}

class BankAccount{
    int balance;
    public BankAccount(int balance){
        this.balance=balance;
    }

    public void deposit(int quantity){
        this.balance += quantity;
    }
    public void showBalance(){
        System.out.println("El saldo de la cuenta es: " + balance);
    }
}

class Rectangle{
    int minorSide, maxSide;

    public Rectangle(int minorSide, int maxSide){
        this.minorSide = minorSide;
        this.maxSide = maxSide;
    }

    public int getPerimeter(){
        return 2*(this.minorSide+this.maxSide);
    }
    public int getArea(){
        return this.minorSide*this.maxSide;
    }
}

class Worker{
    private String name;
    private int salario;
    public Worker(String name, int salario){
        this.name = name;
        this.salario = salario;
    }
    public void showSalario(){
        System.out.println("El salario de " + name + " es de " + salario);
    }
}


class Person2{
    String name;
    public Person2(String name){
        this.name=name;
    }
    public String getName(){
        return this.name;
    }
}

class Product{
    String name;
    double precio;
    public Product(String name ,int precio){
        this.name=name;
        this.precio=precio;
    }

    public void discount(double discount){
        this.precio = this.precio * (1-(discount/100));
    }

    public String showProduct(){
        return "El producto es " + this.name + " y tiene un valor de " + this.precio;
    }
}