package Day1;

import java.util.Scanner;

public class fibbonacci_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number ");
        int n =in.nextInt();

        int a =0;
        int b= 1;
        int count =2;
        System.out.println("value of a,b,count =>" +a+ "  "+b+ " "+count+" ");

        while (count<=n){
            // we store the value of b in a temp variable so that it can used later
            int temp=b;
            System.out.println(" value of temp => "+temp);
            // on we increase the b by adding a and b
            b=a+b;
            System.out.println(" b+a => "+b );
            // a will take the value of b because we move to right
            a=temp;
            System.out.println("a=temp  => "+a);
            // now increasing  the count variable
            count++;
            System.out.println("count++ => "+count);
        }
        System.out.println("fibonacci Number => "+ b );
    }
}
