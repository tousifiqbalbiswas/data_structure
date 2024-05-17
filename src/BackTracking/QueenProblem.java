package BackTracking;

import java.util.Arrays;
import java.util.Scanner;

public class QueenProblem {
    public static void main(String[] args) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */

        Scanner sc=new Scanner(System.in);
        String type=sc.nextLine().trim();

        String[] elements=sc.nextLine().trim().split("\\s+");

        boolean isIntegerArray=true;
        for(String e:elements){

            try{
                Integer.parseInt(e);
//                Integer.ParseInt(e);
            }
            catch(Exception ex){
                isIntegerArray=false;
                break;
            }
        }


        if(isIntegerArray){
            Integer[] nums=new Integer[elements.length];
            for(int i=0;i<elements.length;i++){
                nums[i]=Integer.parseInt(elements[i]);


            }
//            Integer res=sum(nums);
//            System.out.println(res);

        }
        else{

//            String res=sum(elements);
//            System.out.println(res);

        }







        //
        //    if(type.equals("Integer")){
        //        Integer[] nums=new Integer[elements.length];
        //        for(int i=0;i<elements.length;i++){
        //            nums[i]=Integer.parseInt(elements[i]);


        //        }
        //        Integer res=sum(nums);
        //        System.out.println(res);

        //    }
        //    else if(type.equals("String")){
        //        String res=sum(elements);
        //        System.out.println(res);


        //    }


    }

    private static int find(boolean[][] arr, int row) {
        int count=0;
        if (row==arr.length){
            display(arr);
            return 1;
        }

        for (int col=0;col<arr.length;col++){

            if (isSafe(arr,row,col)){
                arr[row][col]=true;
                count+=find(arr,row+1);
                arr[row][col]=false;
//                return count;
            }
        }
        return count;

    }

    private static boolean isSafe(boolean[][] arr,int row,int col) {
        //vertical checking
        for (int i=0;i<row;i++){
            if (arr[i][col])return false;
        }
        int min=Math.min(row,col);

        //left diagonal check
        for (int i=0;i<min;i++){
            if (arr[row-i][col-i])return false;
        }
        //right diagonal
        int maxRight=Math.min(row,arr.length-col-1);
        for (int i=1;i<=maxRight;i++){
            if (arr[row-i][col+i])return false;
        }

        return true;


    }

    static  void display(boolean[][] arr){
        
        
        int a;
        int b;
//        int compare = Integer.compare(a, b);


        for (boolean[] e:arr){
            for (boolean ele:e){
                if (ele){
                    System.out.print("Q");
                }
                else{
                    System.out.print("X");
                }
            }

            System.out.println();
        }
        System.out.println();
    }
}
