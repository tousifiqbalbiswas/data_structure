package StackAndQueue;

import java.util.*;
import java.lang.Math;

public class MaxMinWindows {
    public static void main(String[] args) {
        int[]arr={1,4,3,2,7,9,6,4};
        //  9 7 3 3



       int[]result= maxOfMin(arr, arr.length);
        System.out.println(Arrays.toString(result));
;    }
    public static int[] maxOfMin(int[] arr, int n) {
        //You can code here
        int[]res=new int[arr.length];
        Arrays.fill(res,Integer.MIN_VALUE);
        //-1 0 0 0 3 3 3 3
        int[]left=findMinLeft(arr);
        System.out.println(Arrays.toString(left));
        int[]right=findMinRight(arr);
        // 8 2 3 8 6 6 7 8
        System.out.println(Arrays.toString(right));

        for(int i=0;i<arr.length;i++){
            int wl=right[i]-left[i]-1;
            res[wl-1]=Math.max(res[wl-1],arr[i]);
        }

        for(int j=arr.length-2;j>=0;j--){
            res[j]=Math.max(res[j],res[j+1]);
        }
        return res;
    }
    public static int[] findMinLeft(int[]arr){
        int[]res=new int[arr.length];
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            int cur=arr[i];
            while(!stack.empty()&&arr[stack.peek()]>=cur){
                stack.pop();
            }
            if(stack.empty()){
                res[i]=-1;
            }
            else{
                res[i]=stack.peek();
            }
            stack.push(i);
        }
        return res;
    }
    public static int[] findMinRight(int[]arr){
        int[]res=new int[arr.length];
        Stack<Integer>stack=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
            int cur=arr[i];
            while(!stack.empty()&&arr[stack.peek()]>=cur){
                stack.pop();
            }
            if(stack.empty()){
                res[i]= arr.length;
            }
            else{
                res[i]=stack.peek();
            }
            stack.push(i);
        }
        return res;
    }
}
