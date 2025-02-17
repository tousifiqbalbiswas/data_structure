package Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class TestClass {
    public static void main(String[] args) {
        int[]arr={1,3,47,20};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        Arrays.stream(arr)
                .boxed()
                .sorted((e1, e2) -> Integer.compare(e2, e1))
                .skip(1)
                .limit(1)
                .forEach(e -> System.out.println(e));

       Arrays.stream(arr).boxed()
               .sorted((e1,e2)->Integer.compare(e2,e1))
               .skip(1).limit(1)
               .forEach(e-> System.out.println(e));

    }
}
