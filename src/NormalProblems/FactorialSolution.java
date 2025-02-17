package NormalProblems;

public class FactorialSolution {

    public static void main(String[] args) {
       int res= findFac(7);
        System.out.println(res);


    }

    private static int findFac(int n) {
        int res=1;
        for (int i=1;i<=n;i++){
            res=res*i;

        }
        return res;
    }
}
