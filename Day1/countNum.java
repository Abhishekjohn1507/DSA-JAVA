package Day1;

import java.util.Scanner;

public class countNum {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);

        System.out.println("Enter the number");
        int n= in.nextInt();
//        int n =88876688;

        System.out.println("Enter the your want the occurance ");
        int a =in.nextInt();

        int count=0;
        //count used to find the occurrence of number
        while (n>0){
            //n>0 means n is a non zero integer
            int rem=n%10;
            // rem is used to find the last digit  596 % 10 give  6 as the digit
            if(rem==a){
                //rem==8 means we try to find the digit that we need and much it repeat
                count++;
                // increase the count of occurance
            }
            n=n/10;
            //n=n/10 menas it divide the number and give decimal value which help us to short the number
            //596 / 10 =59.6 => 59 , 6 is neglected
        }
        System.out.println("occurrence of number "+a+" is => "+count);
    }
}
