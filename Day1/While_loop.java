package Day1;

import java.util.Scanner;

public class While_loop {
    public static void main(String[] args) {
        System.out.println("Enter the number for the while loop 1-50");
   Scanner in = new Scanner(System.in);
   int n = in.nextInt();

int num =50;
   while (n<=num){
       System.out.println("Hello World" + n);
       n++;
   }
    }
}
