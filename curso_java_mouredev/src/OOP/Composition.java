package OOP;

public class Composition {
    public static void main(String[] args) {
        // Composición

        var car = new Car();
        var engine = new Engine();

        car.on();


    }


    public static class Engine{
        public void on(){
            System.out.println("Motor encendido");
        }
    }

    public static class Car{
        final private Engine engine = new Engine();
        public void on(){
            engine.on();
        }
    }



}
