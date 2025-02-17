package LeetcodeProblems.ArrayProblems;

public class EvenNumberDigits {
    public static void main(String[] args) {
       int[] num = {12,345,2,6,7896};

       for (int i=0;i<num.length;i++){

           if (String.valueOf(num[i]).length()%2==0)
               System.out.println(num[i]);

       }


    }
}
