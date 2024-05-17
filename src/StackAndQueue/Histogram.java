package StackAndQueue;

import java.util.Arrays;

public class Histogram {
    public static void main(String[] args) {
        int[]arr={11,51,1,2,3};

        int tar=2;
        int count=1;
        int max=largestRectangleArea(arr,0);
        System.out.println(max);
    }
    public static int largestRectangleArea(int[] heights,int i) {
        if (heights.length==0)
            return 0;
        if (heights.length==1)
            return heights[i];
        if (i>heights.length-1)
            return 0;

        int steps=1;
        int cur=heights[i];
        int area=1;
        steps=steps+rightFun(Arrays.copyOfRange(heights,i,heights.length),cur,0)+
        leftFun(Arrays.copyOfRange(heights,i,0),cur,0);
        area=steps*cur;
        int prevArea=largestRectangleArea(heights,i+1);

        if (area>prevArea)
            return area;
        else
            return prevArea;

    }
    private static int rightFun(int[] arr, int tar, int i) {
        int count=0;
        if (arr.length==0){
            return 0;
        }
        if (arr[i]<tar||i> arr.length-1){
            return count;
        }
        if (arr[i]>tar){
            count++;
        }
       return count+ rightFun(arr,tar,i+1);


    }
    private static int leftFun(int[] arr, int tar, int i) {
        int count=0;
        if (arr.length==0){
            return 0;
        }
        if (arr[i]<tar||i> arr.length-1){
            return count;
        }
        if (arr[i]>tar){
            count++;
        }
        return count+ rightFun(arr,tar,i-1);


    }
}
