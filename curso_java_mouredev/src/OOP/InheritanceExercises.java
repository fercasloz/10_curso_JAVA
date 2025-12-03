package OOP;

import java.util.ArrayList;

public class InheritanceExercises {
    public static void main(String[] args) {

        // 1. Crea una clase Vehicle con un método move(). Luego crea una subclase Car que herede de Vehicle y agrega el método honk().
        System.out.println("----------------Ejercicio 1----------------");
        Vehicle vehicle = new Vehicle();
        vehicle.move();
        Car3 car3 = new Car3();
        car3.move();
        car3.hank();

        // 2. Define una clase Person con los atributos name y age. Luego crea una clase Student que agregue el atributo grade y un método study().
        System.out.println("----------------Ejercicio 2----------------");
        var person = new Person3("Fernando",27);
        var student = new Student3("Fer",27,8);
        System.out.println("La persona " + person.name + " y tiene " + person.age);
        System.out.println("El estudiante " + student.name + " y tiene " + student.age + " y ha sacado un " + student.grade);
        student.study();

        // 3. Crea una clase Animal con el método makeSound(). Haz que Dog diga “Woof” y Cat diga “Meow” sobrescribiendo ese método.
        System.out.println("----------------Ejercicio 3----------------");
        var animal = new Animal3();
        animal.makeSound3();
        var dog = new Dog3();
        dog.makeSound3();
        var cat = new Cat3();
        cat.makeSound3();

        // 4. La clase Employee tiene los atributos name y salary. Manager hereda de Employee y agrega el atributo department.
        System.out.println("----------------Ejercicio 4----------------");
        var employee = new Employee3("Ana",26000.00);
        System.out.println(employee.toString());
        var manager = new Manager3("Fernando",54000.00, "Backend Deveploment");
        System.out.println(manager.toString());

        // 5. Crea una clase abstracta Shape con un método calculateArea(). Luego implementa ese método en Circle y Rectangle.
        System.out.println("----------------Ejercicio 5----------------");
        var circle = new Circle3(2.5);
        circle.calculateArea();
        var rectangle = new Rectangle3(5,10);
        rectangle.calculateArea();


        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
        System.out.println("----------------Ejercicio 6----------------");
        var eagle = new Eagle3();
        eagle.fly();

        // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
        System.out.println("----------------Ejercicio 7----------------");
        var phone = new Phone3();


        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().
        System.out.println("----------------Ejercicio 8----------------");
        var account = new Account3(50000);
        account.withdraw(35000);
        account.deposit(10000);
        account.withdraw(60000);

        var saveaccount = new SaveAccounts3(20000);
        saveaccount.addInterest(50);
        saveaccount.addInterest(150);


        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.
        System.out.println("----------------Ejercicio 9----------------");
        var car = new Car31();
        System.out.println(car.describe());
        var bike = new Bike31();
        System.out.println(bike.describe());
        var truck = new Truck31();
        System.out.println(truck.describe());


        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
        System.out.println("----------------Ejercicio 10----------------");
        ArrayList<Animal3> animals = new ArrayList<>();
        animals.add(new Dog3());
        animals.add(new Cat3());

        for (Animal3 a : animals){
            a.makeSound3();
        }
    }
}


abstract class Vehicle3{
    public String describe(){
        return "El vehiculo es";
    }
}

class Car31 extends Vehicle3{
    public Car31(){
        System.out.println("Ha creado un coche");
    }
    @Override
    public String describe() {
        return super.describe() + " un coche";
    }
}

class Bike31 extends Vehicle3{
    public Bike31(){
        System.out.println("Ha creado una moto");
    }
    @Override
    public String describe() {
        return super.describe() + " una moto";
    }
}

class Truck31 extends Vehicle3{
    public Truck31(){
        System.out.println("Ha creado un camion");
    }
    @Override
    public String describe() {
        return super.describe() + " un camión";
    }
}




abstract class Shape{
    abstract void calculateArea();
}


class Employee3{
    String name;
    double salary;
    public Employee3(String name, double salary){
        this.name=name;
        this.salary=salary;
    }
    @Override
    public String toString(){
        return "El empleado se llama " + this.name + " y tiene un sueldo de " + this.salary;
    }
}

class Manager3 extends Employee3{
    String department;
    public Manager3(String name, double salary, String department){
        super(name,salary);
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + " al ser un Manager pertenece al departamento de " + this.department;
    }
}

class Animal3{
    public void makeSound3(){
        System.out.println("Emite algún sonido");
    };
}

class Dog3 extends Animal3{
    @Override
    public void makeSound3(){
        System.out.println("Guau");
    }
}
class Cat3 extends Animal3{
    @Override
    public void makeSound3(){
        System.out.println("Miau");
    }
}


class Vehicle{
    public Vehicle(){

    }
    public void move(){
        System.out.println("El vehículo se mueve");
    }
}

class Car3 extends Vehicle{
    public Car3(){

    }

    public void hank(){
        System.out.println("Método hank");
    }
}

class Person3{
    String name;
    int age;
    public Person3(String name, int age){
        this.name=name;
        this.age=age;
    }
}

class Student3 extends Person3{
    int grade;
    public Student3(String name, int age, int grade){
        super(name,age);
        this.grade=grade;
    }
    public void study(){
        System.out.println("El estudiante está estudiando");
    }
}

abstract class Shape3{
    void calculateArea(){
        System.out.println("El area de la figura es: ");
    };
}

class Circle3 extends Shape3{
    private double radius;
    public Circle3(double radius){
        this.radius=radius;
    }
    @Override
    void calculateArea(){
        System.out.println("El area del circulo es: " + (2 * Math.PI * (Math.pow(this.radius,2))));
    }
}

class Rectangle3 extends Shape3{
    private double minorSide, maxSide;
    public Rectangle3 (double minorSide, double maxSide){
        this.maxSide=maxSide;
        this.minorSide=minorSide;
    }
    @Override
    void calculateArea(){
        System.out.println("El area del rectángulo es: " + (this.minorSide * this.maxSide));
    }
}


abstract class Bird3{
    public void fly(){
        System.out.println("Hay un pajaro volando");
    }
}

class Eagle3 extends Bird3{
    public Eagle3(){}
    @Override
    public void fly(){
        super.fly();
        System.out.println("El pajaro es una Águila!!");
    }
}

class Device3{
    public Device3(){
        System.out.println("Device Created");
    }
}

class Phone3 extends Device3{
    public Phone3(){
        System.out.println("Phone ready!!");
    }
}

class Account3{
    double money;
    public Account3(double money){
        this.money = money;
        System.out.println("Ha creado una cuenta con un saldo de " + this.money);
    }

    public void deposit(double deposit){
        this.money = this.money + deposit;
        System.out.println("El nuevo saldo en la cuenta es de " + this.money);
    }

    public void withdraw(double withdraw){
        if(this.money >= withdraw){
            this.money = this.money - withdraw;
            System.out.println("El nuevo saldo en la cuenta es de " + this.money);
        }else {
            System.out.println("No hay suficiente saldo en la cuenta");
        }
    }
}

class SaveAccounts3 extends Account3{
    public SaveAccounts3(double money) {
        super(money);
    }
    public void addInterest(double interest){
        if(interest >= 1 && interest <= 100){
            this.money = this.money *( 1 + (interest/100));
            System.out.println("El nuevo saldo de la cuenta después de añadir el interés es de " + this.money);
        }else{
            System.out.println("Introduce un interés valido recuerda que solo puede introducir desde un 1% hasta un 100%");
        }
    }
}









































