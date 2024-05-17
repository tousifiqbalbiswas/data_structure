import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MissingPrison {
    public static void main(String args[]){
     List<List<Integer>> list = new ArrayList<>();
     Integer[] arr1 = {6,2,3,6,9,2,3};
     List<Integer> list1 = Arrays.asList(arr1);
        Integer[] arr2 = {4,2,2,6,4,3,3};
        List<Integer> list2 = Arrays.asList(arr2);
        list.add(list1);
        list.add(list2);

        System.out.println(missingPrisoner(list));

    }

    public static List<Integer> missingPrisoner(List<List<Integer>> locations){
        List<Integer> list = new ArrayList<>();
        list.add(locations.get(0).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).findFirst().get());
        list.add(locations.get(1).stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().filter(e->e.getValue()==1).map(e->e.getKey()).findFirst().get());
        return list;

    }
}
