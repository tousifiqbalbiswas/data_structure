package Recursion;

public class NcR {
    /*
    date:23.03.2024 see the sc in pc for better reference
    property 1: nCr=[(n-1) C (r-1)]+[(n-1) C r
                also see the pascal's triangle diagram for better understanding
    property 2: nCr=(n) C (n-r)
     */
    public static void main(String[] args) {
        int n=3;
        int r=2;
       int result= ncr(n,r);
        System.out.println(result);
    }

    private static int ncr(int n, int r) {
        if (r==0||r==n) return 1;
        return ncr(n-1,r-1)+ncr(n-1,r);
    }
}
