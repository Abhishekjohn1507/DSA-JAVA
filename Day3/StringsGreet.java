package Day3;

import java.util.Scanner;

public class StringsGreet {
    public static void main(String[] args) {
        System.out.println("Enter the name");
        Scanner in = new Scanner(System.in);
        String name =in.next();

String message =Greet(name);
        System.out.println(message);
    }

    static String Greet(String name){
        String message =" Hello " + name + " How are you ?";
        return message;


    }
}
