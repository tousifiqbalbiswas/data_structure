package Recursion;

public class JosephusProblem {
    public static void main(String[] args) {
        int[]arr={2,1,3,4,5};
        int k=2;
        int res=killing(3,2);

    }

    private static int killing(int n,int k) {
        System.out.println(n);
        if (n==1)return 0;
        int index=(killing(n-1,k)+k) % n;
        return index;




    }
}
