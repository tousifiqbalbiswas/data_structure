package BackTracking;

import java.util.Arrays;

public class GenerateBalancedParenthesis {
    public static void main(String[] args) {
       int n=2;
        char[]arr=new char[n*2];

        


        generate(arr,0,0,0,n);
    }

    private static void generate(char[]arr,int i,int o,int c,int n) {
//

        if (i==arr.length) {
            System.out.println(Arrays.toString(arr));
            return;
        }
//        if (i==0){
//            arr[0]='(';
//            generate(arr,i+1,o+1,c,n);
//        }
         if (o<arr.length/2){
            arr[i]='(';
            generate(arr,i+1,o+1,c,n);
        }
         if (c<o) {
            arr[i]=')';
            generate(arr,i+1,o,c+1,n);
        }


    }
}
