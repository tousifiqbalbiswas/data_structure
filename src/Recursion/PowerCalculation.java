package Recursion;

public class PowerCalculation {
    public static void main(String[] args) {
        int pow=3;
        int num=2;
        String s="tou";
        System.out.println(s.substring(0,0)+"test");
        int ans=powerFind(num,pow);
        //using n complexity
        int ans2= powerFindUsingRecursion(num,pow);
        //using log(n) complexity
        int ans3 = powerFindUsingRecursionWithLogN(num, pow);
        System.out.println(ans3);
    }

    private static int powerFindUsingRecursionWithLogN(int num, int pow) {

        if (pow==1)
            return num;
        if (pow%2==0){
            return powerFindUsingRecursionWithLogN(num*num,pow/2);
        }
        else{
            return num*num*powerFindUsingRecursionWithLogN(num,pow-2);
        }

    }
    private static int powerFindUsingRecursion(int num, int pow) {
        if (pow==1)
            return num;

       return num*powerFindUsingRecursion(num,pow-1);

    }

    private static int powerFind(int num, int pow) {
        int res=1;
        for (int i=0;i<pow;i++){
            res=res*num;


        }
        return res;


    }
}
