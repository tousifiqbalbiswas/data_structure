package LeetcodeProblems;

import java.util.*;

public class TwoSum {


    public static int[] twoSum(int[] arr, int target) {

        int[]res={-1,-1};
        HashMap<Integer,Integer>map=new HashMap<>();
        for (int i=0;i< arr.length;i++){
            if(res[0]==-1&&target/2==arr[i]){
                res[0]=i;
                map.put(arr[i],i);
                continue;
            }
            if(res[1]==-1&&target/2==arr[i]){
                res[1]=i;
                return res;
            }
            map.put(arr[i],i);
        }
        res[0]=-1;
        res[1]=-1;
        for (int i=0;i<map.size();i++){
            Integer curr=arr[i];
            Integer sub = target - curr;
            if (map.containsKey(sub)) {
                res[0] = map.get(curr);
                res[1] = map.get(sub);
            }
        }
        return res;
    }

    public static void main(String[] args) {
    int[]arr={1,1,1,1,1,4,1,1,1,1,1,7,1,1,1,1,1};
//    int[]arr={3,3};
        int[] r = twoSum(arr, 11);
        System.out.println(Arrays.toString(r));

    }
//        Integer[]arr={1,3,6,8};
//        Integer tar=9;
//        List<Integer>list= Arrays.asList(arr);
//        HashMap<Integer,Integer>map=new HashMap<>();
//        Set<Integer>result=new HashSet<>();
//        for (int i=0;i< arr.length;i++){
//            map.put(arr[i],i);
//        }
//        for (int i=0;i<map.size();i++){
//
//            Integer curr=arr[i];
//            Integer sub = tar - curr;
//            if (map.containsKey(sub)){
//                result.add(map.get(curr));
//                result.add(map.get(sub));
//            }
//        }
//        System.out.println(result);
//    }
}
