package Stream;

import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int[]arr={1,3,5,46,23,11,323,43,223,232,34,23,23};
        System.out.println(Arrays.toString(arr));
        for (int i=0;i<arr.length/2;i++){
            int temp=arr[arr.length-1-i];
            arr[arr.length-1-i]=arr[i];
            arr[i]=temp;
        }

        System.out.println(Arrays.toString(arr));
    }



}
