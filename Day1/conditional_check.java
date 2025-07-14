package Day1;

import java.util.Scanner;

public class conditional_check {
    public static void main(String[] args) {
//        int a=10;
//        int b=12;
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number a");
        int a= in.nextInt();
        System.out.println("Enter the number b");
        int b = in.nextInt();


        if(a==10 && b==12){
            System.out.println("both are correct && ");
        }else {
            System.out.println("not good");
        }

        if (a ==10 || b==12){
            System.out.println("a and b are correct ||");
        }else {
            System.out.println("number is not 10 , 12");
        }

        // character check
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Character");
        char ch =sc.next().trim().charAt(0);

        if (ch >='a'|| ch<='z'){
            System.out.println("lower");
        }else {
            System.out.println("upper");
        }



    }
}
