package OOP;

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

        // 6. Crea una clase Bird con el método fly(). Luego crea Eagle que sobrescriba fly() pero también llame al método original con super.fly().
        System.out.println("----------------Ejercicio 6----------------");

        // 7. Haz una clase Device con un constructor que imprima “Device created”. Luego crea Phone que herede de Device y en su constructor imprima “Phone ready”.
        System.out.println("----------------Ejercicio 7----------------");

        // 8. Account tiene un saldo y métodos para deposit() y withdraw(). SavingsAccount hereda y agrega un método addInterest().
        System.out.println("----------------Ejercicio 8----------------");

        // 9. Crea una clase Vehicle y tres subclases: Car, Bike y Truck, cada una con un método describe() sobrescrito.
        System.out.println("----------------Ejercicio 9----------------");

        // 10. Crea un ArrayList<Animal> que contenga instancias de Dog, Cat y Bird. Recorre la lista y llama a makeSound().
        System.out.println("----------------Ejercicio 10----------------");
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