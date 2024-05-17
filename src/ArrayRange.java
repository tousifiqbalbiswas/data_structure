import java.sql.SQLOutput;

public class ArrayRange {

    public static void main(String args[]) {


        int[] arr = {2, 4, 7, 8, 6};

        int[] start = new int[5];
        int d = 2;
        int[] end = new int[5];
        int[] res = new int[5];

        for (int i = 0; i < 5; i++) {
            start[i] = arr[i] - d <= 0 ? 1 : arr[i] - d;
            end[i] = arr[i] + d;
        }
        for(int i =0 ; i<5;i++){
            for(int j=0;j<5;j++){
                if(i==j)
                    continue;
                if(start[j] <= arr[i] && end[j] >= arr[i]){
                    res[i]= j+1;
                    break;
                }
            }
        }
        for(int a : res){
            System.out.println(a);
        }
    }
}
