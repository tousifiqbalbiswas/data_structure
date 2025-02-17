package Stream;

import java.util.Arrays;

public class FindMaxSecondMaxWithoutSorting {

    public static void main(String[] args) {
        int[]arr={0,1};

        int fMax=Integer.MIN_VALUE;
        int sMax=Integer.MIN_VALUE;

        for (int i=0;i<arr.length;i++){

            if (arr[i]>fMax){
                sMax=fMax;
                fMax=arr[i];
            }
            else if (arr[i]<fMax&&arr[i]>sMax)
                sMax=arr[i];

        }
        if (sMax==Integer.MIN_VALUE)
            System.out.println("there is not second largest value");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(fMax+" and "+sMax);
    }
}
