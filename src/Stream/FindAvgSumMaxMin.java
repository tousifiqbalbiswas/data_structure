package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindAvgSumMaxMin {
    public static void main(String[] args) {
        int[]arr={1,3,5,46,23,11,323,43,223,232,34,23,23};


        Arrays.stream(arr).boxed().forEach(System.out::println);
       List<Integer> list= Arrays.stream(arr).boxed().filter(e->e>1).sorted((e1,e2)->Integer.compare(e2,e1)).collect(Collectors.toList());
        List<Integer> limit = Arrays.stream(arr).boxed().sorted().skip(1).limit(1).collect(Collectors.toList());

        Arrays.stream(arr).boxed().peek(e-> System.out.println(e+"peek element")).forEach(System.out::println);


        System.out.println(list);
        System.out.println(limit);
    }
}
