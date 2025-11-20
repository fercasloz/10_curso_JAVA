package OOP;

public class Person {

    // Atributos

    String name;
    int age;

    // Consttructor
    public Person(String name, int age){
        this.name=name;
        this.age=age;
    }

    // Métodos
    public void sayHello(){
        System.out.println("Hola, soy " + name + " y tengo " + age + " años.");
    }
}
