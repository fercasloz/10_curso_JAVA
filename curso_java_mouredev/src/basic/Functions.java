package basic;

import java.util.ArrayList;
import java.util.Arrays;

public class Functions {

    public static void main(String[] args) {


        sendEmail();
        sendEmailToUser("fernando@gmail.com");
        sendEmailToUser("fernando@gmail.com","Fer");

        var users =  new ArrayList<String>(Arrays.asList("fer@gmail.com","fernando@gmail.com","fcl@gmail.com"));
        sendEmailToUser(users);

        //--------------

        System.out.println("------------------------");
        var state = sendEmailwithState("");
        System.out.println(state);

    }


    public static void sendEmail(){
        System.out.println("Se envía el email");
    }


    // Función con parámetros

    public static void sendEmailToUser(String email){
        System.out.println("Se envía el email a " + email);
    }

    public static void sendEmailToUser(String email, String name){
        System.out.println("Se envía el email a " + email + " ( " + name + " )");
    }

    public static void sendEmailToUser( ArrayList<String> emails){
        for (String email : emails){
            System.out.println("Se envia el email a " + email);
        }
    }



    // Función con retorno


    public static boolean sendEmailwithState(String email){
        if(email.isEmpty()) {
            return false;
        }
        System.out.println("Se envia el email a" + email);
        return true;
    }


}
