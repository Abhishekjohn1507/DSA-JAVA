package Day3;

public class swap {
    public static void main(String[] args) {
        int a =10;
        int b=20;
        System.out.println(a+" "+b);
        int temp =a;
        a = b;
        b=temp;
        System.out.println("reverse "+ a+" "+b);
    }
}
