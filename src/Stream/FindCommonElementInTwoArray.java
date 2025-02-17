package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindCommonElementInTwoArray {
    public static void main(String[] args) {
        int[]arr1={1,3,47,20};
        int[]arr2={13,3,437,20};

        List<Integer> list1 = Arrays.stream(arr2).boxed().filter(e -> Arrays.stream(arr1).anyMatch(num -> e == num)).toList();

        System.out.println(list1);
        List<Integer> list=Arrays.stream(arr1).boxed().toList();

        List<Integer> collect = Arrays.stream(arr2).boxed().filter(e -> list.contains(e)).collect(Collectors.toList());

        System.out.println(collect);
    }
}
