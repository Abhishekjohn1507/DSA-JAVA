package Day1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

int ans= 0;
while (true){
    System.out.println("enter the operators");
    char op = in.next().trim().charAt(0);

    if(op=='+' || op=='-' || op=='*' || op== '/' || op=='%'){
        System.out.println("enter the first number");
        int a= in.nextInt();
        System.out.println("enter the second number");
        int b= in.nextInt();

        if(op== '+'){
            ans =a+b;
        }
        if(op== '-')
        {
            ans =a-b;
        }
        if(op== '*'){
            ans =a*b;
        }
        if(op== '/'){
            if (b!=0){
                ans =a/b;

            }
        }
        if(op== '%'){
            ans =a%b;
        }




    } else if (op=='x'||op=='X') {
        break;

    }else {
        System.out.println("invalid");
    }
    System.out.println(ans);
}




    }
}
