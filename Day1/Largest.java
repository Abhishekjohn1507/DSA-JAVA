package Day1;

import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("enter the numbers A");
        int a =in.nextInt();
        System.out.println("enter the numbers B");
        int b= in.nextInt();
        System.out.println("enter the numbers C");

        int c= in.nextInt();
        System.out.println("enter the numbers " + a +" " + b + " "+ c + " ");

        int max =a;

        if (b>max){
            max=b;
        }if (c>max) {
            max=c;
        }

        System.out.println("Maximum " + max);

    }
}
