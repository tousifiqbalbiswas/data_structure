public class EqualArray {
    public static void main(String args[]){
        int[] arr = {1,4,2,1};
        int totalcost=0,cost=0;

        for(int i=arr.length -1;i >0; i--){
          //  cost + = arr[i] - arr[i-1]
            totalcost += Math.abs(arr[i] - arr[i-1]);
        }
        System.out.println(totalcost);
    }
}
