package Day2;

import java.util.Scanner;

public class nestedSwitch {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("enter enp ID");
        int empID= in.nextInt();

        String depart = in.next();
        switch (empID){
            case 1 -> System.out.println("Johe Doe");
            case 2 -> System.out.println("Abhishek");

            case 3 -> {System.out.println("ENTER Department");

                switch (depart) {
                    case "IT" -> System.out.println("IT DepartMent");
                    case "Management" -> System.out.println("Management");
                    default -> System.out.println("not valid department");

                }

            }
            default -> System.out.println("no valid emp Id");
        }
    }
}
