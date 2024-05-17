package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        int n=8;
        int first=0;
        int second=1;
        int fibonacci = getFibonacci(n);
        System.out.println(fibonacci);
    }

    private static int getFibonacci(int n) {
        if (n<2)
            return n;

        return getFibonacci(n-1)+getFibonacci(n-2);

    }

}
