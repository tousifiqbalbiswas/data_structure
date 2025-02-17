package Stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindTheWordOccurrenceInString {
    public static void main(String[] args) {
        String s="welcome to the one of the largest capital of India";
        findOcc(s);
        String[]arr=s.split("");
        System.out.println(arr[0]);

        List<String> list= Arrays.asList(arr);

        Map<String,Long>res=Arrays.stream(arr).collect(Collectors.groupingBy(e->e,Collectors.counting()));

        System.out.println(res);


       Map<String, Set<String>>ll=list.stream().collect( Collectors.groupingBy(Function.identity(), Collectors.toSet()  )   );


//        list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        HashMap<String,Integer> map=new HashMap<>();



//        System.out.println(collect);


        //using stream

    }

    private static void findOcc(String s) {

        String[] arr=s.split(" ");

        Map<String, Long> collect = Arrays.stream(arr).collect(Collectors.groupingBy(e -> e, Collectors.counting()));
        System.out.println(collect);
    }

}
