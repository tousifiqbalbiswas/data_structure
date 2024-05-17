package StackAndQueue;

public class UnsortedArrayLengthInArray {
    public static void main(String[] args) {
        int[]arr={1 ,4 ,3 ,2 ,5};
        int res=findUnsortedSubarray(arr);
    }
    public static int findUnsortedSubarray(int[] arr) {
    int min=Integer.MIN_VALUE;
    int max=Integer.MAX_VALUE;
    int si=-1;
    int ei=-1;
        for (int i=0;i<arr.length;i++){
        if (arr[i]>=min) min=arr[i];
        else ei=i;
        }
        for (int i=arr.length-1;i>=0;i--){
        if (arr[i]<=max)max=arr[i];
        else si=i;
        }
    if(ei!=-1)return ei-si+1;
    return 0;



    }
}
