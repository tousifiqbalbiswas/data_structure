package ArrayDataStructure;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SortedArrayDublicate {

    public static Set<Integer> removeDuplicates(int[] arr) {
        Set<Integer> s1=new HashSet<>();
        Integer[]arrr={1,2,3,2};
        List<Integer> list=Arrays.asList(arrr);
        Collections.sort(list);
        int count = 0;


        s1.forEach(e-> System.out.println(e));
        for(int i=0;i<arr.length;i++){
            if(s1.add(arr[i]))
                count++;
        }
        return s1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2};
        int cc=020;
        cc=002;
        System.out.println(cc);
        IntStream intStream = Arrays.stream(arr).filter(e -> e > 10);
        System.out.println(removeDuplicates(arr));

    }
}
