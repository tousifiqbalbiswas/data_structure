package RoughPractices;

import java.util.Arrays;
import java.util.Objects;

public class InterviewQ1 {
    public static void main(String[] args) {
        Object[]arr={1,2};
        Object[]input1={1,2};
        Object[] array = {1, 2, new Object[]{3, 4, new Object[]{5}, 6, 7}, 8, 9, 10};


//        for (Object e:array){
//           if (e instanceof )
//        }


//        int[]input={1,2,3,0,0,0,new int[2]};
        int[]input2={2,5,6};
//        merge(input,3,input2,3);


    }

//    Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6],
//    n = 3Output: [1,2,2,3,5,6]
//    Explanation: The arrays we are merging are [1,2,3] and [2,5,6].

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i=m-1;
        int j=n-1;
        int k=nums1.length-1;

        while(i>=0&&j>=0){

            if (nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
            }
            else {
                nums1[k--]=nums2[j--];
            }
        }

        while (i<=0){
            nums1[k--]=nums1[i--];

        }



        System.out.println(Arrays.toString(nums1));
    }
}
