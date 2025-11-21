package basicExercises;

public class AccessModifiersExercises {
    public static void main(String[] args) {

        // 1. Crea una clase Person con atributos privados name y age. Usa los métodos getName(), setName(), getAge() y setAge() para asignar y mostrar valores desde otra clase.
        System.out.println("---------------Ejercicio 1---------------");
        Person1 persona1 = new Person1("Fernando",27);
        System.out.println("Hola me llamo " + persona1.getName() + " y tengo " + persona1.getAge() + " años");

        persona1.setName("Fer");
        persona1.setAge(28);
        System.out.println("Hola me llamo " + persona1.getName() + " y tengo " + persona1.getAge() + " años");

        System.out.println("\n");


        // 2. Crea una clase Product con el atributo privado price. Añade el método setPrice(double price) que solo permita precios mayores a 0.
        System.out.println("---------------Ejercicio 2---------------");
        Product1 product1 = new Product1(50);
        product1.showProduct1();
        product1.setPrice(0);
        // product1.showProduct1();
        product1.setPrice(65);
        product1.showProduct1();

        System.out.println("\n");

        // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.
        System.out.println("---------------Ejercicio 3---------------");
        BankAccount1 myAccount = new BankAccount1(10000);
        myAccount.deposit(1000);
        myAccount.showBalance();
        myAccount.withdraw(5000);
        myAccount.showBalance();
        myAccount.withdraw(15000);

        System.out.println("\n");

        // 4. Crea una clase Book con el atributo privado title. Permite leerlo con el método getTitle() pero no modificarlo (sin setTitle()). El título debe asignarse solo por el constructor.
        System.out.println("---------------Ejercicio 4---------------");
        Book1 book1 = new Book1("Harry Potter");
        System.out.println(book1.getTitle());

        System.out.println("\n");

        // 5. Crea una clase Temperature con el atributo privado celsius. El método setCelsius(double celsius) solo debe aceptar valores entre -100 y 100.
        System.out.println("---------------Ejercicio 5---------------");
        Temperature temp = new Temperature();
        temp.setCelsius(59);
        temp.showTemperature();
        temp.setCelsius(-250);

        System.out.println("\n");

        // 6. Crea una clase User con los atributos privados username y password. Implementa los métodos setUsername(String username), setPassword(String password) y checkPassword(String inputPassword) que compare contraseñas.
        System.out.println("---------------Ejercicio 6---------------");
        User user1 = new User("fercasloz","fercasloz1");
        user1.checkPassword("fercasloz1");
        System.out.println(user1.checkPassword("fercasloz1"));
        user1.setPassword("Fercasloz1");
        System.out.println(user1.checkPassword("fercasloz1"));

        System.out.println("\n");


        // 7. Crea una clase Employee con el atributo privado salary. Agrega el método raiseSalary(double percent) que solo permita aumentos positivos.
        System.out.println("---------------Ejercicio 7---------------");
        Employee employee1 = new Employee(2500);
        employee1.showSalary();
        employee1.raiseSalary(3000);
        employee1.showSalary();
        employee1.raiseSalary(2500);
        employee1.showSalary();
        System.out.println("\n");

        // 8. Crea una clase Rectangle con los atributos privados width y height. Agrega setters y el método calculateArea() que devuelva el resultado de width * height.
        System.out.println("---------------Ejercicio 8---------------");
        Rectangle1 rectangle1 = new Rectangle1(5,10);
        System.out.println("El area del rectangulo es : " +
                                    rectangle1.calculateArea());
        rectangle1.setWidth(10);
        rectangle1.setHeight(15);
        System.out.println("El area del rectangulo es : " +
                                    rectangle1.calculateArea());
        System.out.println("\n");


        // 9. Crea una clase Student con el atributo privado grade. Agrega los métodos setGrade(int grade) y isPassed() que retorne true si la nota es mayor o igual a 60.
        System.out.println("---------------Ejercicio 9---------------");
        Student1 student1 = new Student1(65);
        if(student1.isPassed()){
            System.out.println("El estudiante ha aprobado");
        }else{
            System.out.println("El estudiante no ha aprobado");
        }
        Student1 student2 = new Student1(45);
        if(student2.isPassed()){
            System.out.println("El estudiante ha aprobado");
        }else{
            System.out.println("El estudiante no ha aprobado");
        }
        System.out.println("\n");

        // 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).
        System.out.println("---------------Ejercicio 10---------------");
        Car1 car1 = new Car1(90);
        car1.showSpeed();
        car1.accelerate(30);
        car1.showSpeed();
        car1.accelerate(20);
        car1.showSpeed();

        car1.brake(80);
        car1.showSpeed();
        car1.brake(80);
        car1.showSpeed();

    }
}


class Person1{
    private String name;
    private int age;
    public Person1(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age) {
        if(age>0){
            this.age=age;
        }else {
            System.out.println("Edad no valida");
        }

    }
    public int getAge(){
        return age;
    }
}


class Product1{
    private int price;
    public Product1(int price){
        this.price = price;
    }

    public void setPrice(int price){
        if(price > 0){
            this.price=price;
        }else {
            System.out.println("El precio debe ser mayor de 0");
        }
    }

    public void showProduct1(){
        System.out.println("El precio del producto es " + this.price);
    }

}


class BankAccount1{
    private double balance;
    public BankAccount1(double balance){
        this.balance=balance;
    }

    public void deposit(double quantity){
        this.balance = this.balance + quantity;
    }
    public void withdraw(double quantity){
        if(this.balance >= quantity){
            this.balance = this.balance - quantity;
        }else{
            System.out.println("No tienes suficiente dinero para retirar");
        }
    }
    public void showBalance(){
        System.out.println("El balance de la cuenta es de : " + this.balance);
    }
}

class Book1{
    private String title;
    public Book1(String title){
        this.title = title;
    }
    public String getTitle(){
        return title;
    }
}

class Temperature{
    private double celsius;
    public Temperature(){}
    public void setCelsius(double celsius){
        if(celsius >= -100 && celsius <= 100){
            this.celsius=celsius;
        }else {
            System.out.println("La temperatura introducida es incorrecta" + "\n" + "Recuerde que la temperatura introducida deber estar entre -100 y 100");
        }
    }

    public void showTemperature(){
        System.out.println("La temperatura es " + this.celsius + " Celsius");
    }
}


class User{
    private String username, password;
    public User(String username, String password){
        this.username=username;
        this.password=password;
    }

    public void setUsername(String username){
        this.username = username;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public Boolean checkPassword(String password){
        if(this.password.equals(password)){
            return true;
        }else{
            return false;
        }
    }
}

class Employee{
    private Double salario;
    public Employee(double salario){
        this.salario = salario;
    }

    public void raiseSalary(double salario){
        if(salario >= this.salario && salario >= 0) {
            this.salario = salario;
        }else{
            System.out.println("Solo se permiten aumentos positivos del salario");
        }
    }

    public void showSalary(){
        System.out.println("El salario del empleado es de " + this.salario);
    }
}

class Rectangle1{
    private double width,height;

    public Rectangle1(double width, double height){
        this.width=width;
        this.height=height;
    }

    public void setWidth(double width){
        this.width = width;
    }
    public void setHeight(double height){
        this.height = height;
    }

    public double calculateArea(){
        double area = this.height * this.width;
        return area;
    }
}

class Student1{
    private int grade;
    public Student1 (int grade){
        this.grade = grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public boolean isPassed(){
        if(this.grade >= 60){
            return true;
        }else{
            return false;
        }
    }
}

// 10. Crea una clase Car con el atributo privado speed. Agrega los métodos accelerate(int amount) que aumente la velocidad (máximo 120) y brake(int amount) que reduzca la velocidad (mínimo 0).

class Car1{
    private int speed;
    public Car1(int speed){
        if (speed >= 0 && speed <= 120){
            this.speed = speed;
        }
    }

    public void accelerate(int amount){
        if(this.speed + amount <= 120){
            this.speed = this.speed + amount;
        }else{
            System.out.println("No se puede acelerar por encima de 120km/h");
        }
    }

    public void brake(int amount){
        if(this.speed - amount >= 0){
            this.speed = this.speed - amount;
        }else{
            System.out.println("No se puede ir a meneos de 0km/h");
        }
    }

    public void showSpeed(){
        System.out.println("El coche va a una velocidad de : " + this.speed + " Km/h");
    }
}


