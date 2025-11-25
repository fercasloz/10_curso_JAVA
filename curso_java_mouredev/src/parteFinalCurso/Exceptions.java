package parteFinalCurso;

public class Exceptions {
    public static void main(String[] args) throws CustomException {

        //try catch
        try{
            var result = 10 / 0;
            System.out.println(result);
        }catch (Exception e){
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Fin");


        //try con multiples catch
        try{
            var result = 10 / 5;
            System.out.println(result);

            var name = "Brais";
            name = null;
            System.out.println("Name: " + name.toUpperCase());
        }catch (ArithmeticException e){
            System.out.println("Error, no puedes dividir por 0: " + e.getMessage());
        }catch (NullPointerException e){
            System.out.println("Error, ha ocurrido un NullPointerException: " + e.getMessage());
        }catch (Exception e){
            System.out.println("Error, ha ocurrido algo inesperado: " + e.getMessage());
        }
        System.out.println("Fin");

        // finally
        try{
            var result = 10 / 0;
            System.out.println(result);
        }catch (ArithmeticException e){
            System.out.println("Error: " + e);
        }finally {
            System.out.println("El bloque try-catch ha acabado");
        }

        System.out.println("Fin");


        // throw

        var throwExample = new ThrowExample();

        try{
            throwExample.checkAge(16);
        }catch (IllegalArgumentException e){
            System.out.println("Error revisando la edad: "+ e.getMessage());

        }


        // Excepción personalizada
        try{
            throwExample.checkScore(450);
        }catch(CustomException e){
            System.out.println("Error revisando la puntuación: " + e.getMessage());
        }





    }
}
