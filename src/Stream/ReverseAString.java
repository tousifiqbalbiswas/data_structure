package Stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.IntStream;

public class ReverseAString {
    public static void main(String[] args) {
        String s="tousif iqbal Biswas";
        System.out.println(s.contains("s"));
        int[]arr={1,3,5,46,23,11,323,43,223,232,34,23,23};

        String[] split = s.split("");
        String string = Arrays.stream(split).reduce("", (c1, c2) -> c2 + c1).toString();
        System.out.println(string);
        System.out.println(Arrays.toString(split));

        Integer reduce = Arrays.stream(arr).boxed().reduce((a, b) -> a + b).get();
        System.out.println(reduce);

    }
}
