package Day1;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //character check
        System.out.println("enter character ");
        // 0th index
        char ch =in.next().trim().charAt(0);
        System.out.println("character "+ch);
        //trim

        System.out.println("enter string ");
        String ch1 =in.next().trim();
        System.out.println("Trim "+ch1);

    }
}
