package Stream;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxDifference {


    public static void main(String[] args) {
        int[]arr={2, 3, 10, 6, 4, 8, 1};

        int diff=Integer.MIN_VALUE;
//        for (int i=0;i< arr.length-1;i++) {
//            for (int j =i+1 ; j < arr.length ; j++) {
//                if(arr[i]<arr[j]&&arr[j]-arr[i]>diff){
//                    diff=arr[j]-arr[i];
//                }
//            }
//        }

        System.out.println(calculateMaxDifferenceBetweenTwoElements(arr));


    }
    public static int calculateMaxDifferenceBetweenTwoElements(int[] arr)
    {
        int minElementTillNow=arr[0];
        int maxDifference=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int difference=0;
            if(arr[i] >minElementTillNow)
            {
                difference=arr[i]-minElementTillNow;
                if(difference > maxDifference)
                {
                    maxDifference=difference;
                }
            }
            else
            {
                minElementTillNow=arr[i];
            }
        }
        System.out.println(maxDifference);
        return maxDifference;
    }
}
