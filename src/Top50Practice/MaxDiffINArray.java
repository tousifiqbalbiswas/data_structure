package Top50Practice;

public class MaxDiffINArray {
    public static void main(String[] args) {
        int[]arr={2, 3, 10, 6, 4, 8, 1};


        int maxDiff=0;
        int minEle=arr[0];


        for (int i=0;i<arr.length;i++){
            int diff=0;
            if (arr[i]>minEle){
                diff=arr[i]-minEle;
                if (diff>maxDiff) maxDiff=diff;
            }
            else {
               minEle=arr[i];
            }
        }

        System.out.println(maxDiff);



    }
}
