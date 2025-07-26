package Day3;

import java.util.Scanner;

public class function {
    public static void main(String[] args) {
sum();

    }
    static void sum(){
        Scanner in = new Scanner(System.in);

        int a ,b ,sum;
        System.out.println("Enter the 1 number");
        a= in.nextInt();
        System.out.println("Enter the 2 number");
        b = in.nextInt();
        sum=a+b;
        System.out.println("SUM of two numbers = "+sum);
    }
}
