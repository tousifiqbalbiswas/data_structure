package Recursion;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class SkipACharacterInString {
    public static void main(String[] args) {
        String s="TousifIqbalBiowas";

        String[]chars=s.split("");
        String rev=Arrays.stream(chars)
                .reduce("",(a,b)->b+a).toString();


        Map<String, Long> collect = Arrays.stream(chars).collect(Collectors.groupingBy(e -> e, Collectors.summingLong(c -> 1L)));
        System.out.println(collect);

        String s1 = find(s,'o');

        System.out.println(s1);
    }

    private static String find(String s,Character tar) {




        if (s.length()==0)
            return s;
        Character ch=s.charAt(0);

        if (ch==tar){
          return  ""+ find(s.substring(1),tar);
        }
        else {
            return ch+ find(s.substring(1),tar);
        }




    }

}
