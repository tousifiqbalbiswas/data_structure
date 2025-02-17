package LeetcodeProblems.StringProblems;

public class PalindromeCheck {

    public static void main(String[] args) {
        getPrimeNumber(100);
    }




    public  static  void getPrimeNumber(int n){

        for(int i=3;i<n;i++){
            boolean isPrime=true;
            
                for (int j=2;j<i;j++){
                    if (i%j==0){
                        isPrime=false;
                        continue;
                    }
                }
                if (isPrime)
                    System.out.println("its a prime number"+i);

}



        }




    }

