package LeetcodeProblems.StringProblems;

import java.util.Arrays;
import java.util.HashMap;

public class FindTheWordsOccurrence {


    public static void main(String[] args) {
        String s="welcome to the one of the largest capital of India";

        String[]arr=s.split(" ");
        System.out.println(arr[0]);

        HashMap<String,Integer>map=new HashMap<>();

        for(int i=0;i<arr.length;i++){
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        System.out.println(map);


        //using stream




    }


}
