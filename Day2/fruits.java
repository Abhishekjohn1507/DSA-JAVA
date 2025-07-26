package Day2;

import java.util.Scanner;

public class fruits {
    public static void main(String[] args) {
        System.out.println("enter fruit");
        Scanner in = new Scanner(System.in);
        String fruit = in.next();

//        if (fruit.equals("mango")){
//            System.out.println("King of fruit");
//        }
//        if (fruit.equals("apple")){
//            System.out.println("Sweet red fruit");
//        }

        switch (fruit) {
            case "apple" -> System.out.println("Red Apple ");
            case "mango" -> System.out.println("King of Fruit");
            case "grapes" -> System.out.println("small ball of sugars");
            case "kiwi" -> System.out.println("tangy little");
            default -> System.out.println("not found 404");
        }

    }
}
