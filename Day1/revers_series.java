package Day1;

public class revers_series {
    public static void main(String[] args) {
        int n=545487;

        int count =0;
        while (n>0){
            //n>0 means n must be greater than 0 for while operation
            int rem=n%10;
            System.out.println("rem "+rem);
            // it separate the digits   745 % 10 = 5
            n=n/10;
            System.out.println("n "+n);
            // here we reduce the number 745 / 10 = 74.5  so we only consider the 74 not .5
            count =count*10+rem;
            System.out.println("count "+count);
            // count the series
            // 0*10 + 5 , 5*10+4= 50+4 =54 , 54*10+7=540+7=547
        }
        System.out.println("reverse series "+count);
    }
}
