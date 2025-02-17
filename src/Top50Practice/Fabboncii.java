package Top50Practice;

public class Fabboncii {

    public static void main(String[] args) {
        int n=7;
        int fabo = fabo(n);
        System.out.println(fabo);
//        for (int i=0;i<n;i++){
//            System.out.println(fabo(i));
//        }

        optimizedSolution(n);
    }

    private static void optimizedSolution(int n) {
        int fir=0;
        int sec=1;
//        System.out.print();

        for (int i=0;i<n;i++){

            System.out.println(fir);
            int dig=fir+sec;
            fir=sec;
            sec=dig;
        }
        System.out.println("first and sec is "+fir+sec);
    }

    private static int fabo(int n) {
        if (n==1||n==0) return n;
        int res=fabo(n-1)+fabo(n-2);
//        System.out.println(res);
        return res;

    }
}
