package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class FindDuplicate {
    public static void main(String[] args) {
        int[]arr={1,3,5,46,23,11,323,43,223,232,34,23,23};
        Set<Integer>set=new HashSet<>();

       Set<Integer>res= Arrays.stream(arr).boxed().filter(e->!set.add(e)).collect(Collectors.toSet());
       Map<Integer,Long> map= Arrays.stream(arr).boxed().
               collect(
                       Collectors.groupingBy(e->e,Collectors.counting())
               );
       List<Integer>list=map.entrySet().stream().filter(e->e.getValue()<=1).map(e->e.getKey()).collect(Collectors.toList());


        System.out.println(map);
        System.out.println(list);

    }
}
