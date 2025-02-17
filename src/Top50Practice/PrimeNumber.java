package Top50Practice;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        System.out.println("enter the number");
//        int n=sc.nextInt();
        int n=10;
        boolean func = func(n);
        System.out.println(func);
    }

    private static boolean func(int n) {
        if (n==0&&n==1)
            return false;

        for (int i=2;i<n;i++){
            if (n%i==0){
                System.out.println("not a prime");
                return false;
            }
        }
        return true;
    }
}
