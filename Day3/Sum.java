package Day3;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
       int ans= sum();
        System.out.println("Ans return by sum "+ans);
    }
    static int sum (){
        Scanner in =new Scanner(System.in);
        System.out.println("enter the first num");
        int a = in.nextInt();
        System.out.println("Enter the second num");
        int b =in.nextInt();

        int sum=a+b;
        return sum;
    }
}
