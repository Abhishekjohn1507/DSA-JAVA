package Day1;

import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
        System.out.println("enter the number from 1-n");
        Scanner in =new Scanner(System.in);
        int n= in.nextInt();
        for (int num = 0; num <n ; num++) {
            System.out.println("Number: " + num);
//            System.out.println(num +" ");
            System.out.println("Praise The Lord");

        }
    }
}
