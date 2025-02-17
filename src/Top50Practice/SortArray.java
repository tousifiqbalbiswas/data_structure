package Top50Practice;

import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int[]arr={4,8,7,8,4,4,7,7,4,41,7};

        int sum1 = Arrays.stream(arr).sum();
        int sum = Arrays.stream(arr).reduce(Integer::sum).getAsInt();
        System.out.println(sum+" "+sum1);

        for (int j=0;j< arr.length;j++) {
            for (int i = 0; i < arr.length-1; i++) {
                if (arr[i] > arr[i + 1]) {

                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
