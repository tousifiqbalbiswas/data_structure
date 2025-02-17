package ArrayDataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main111 {
    public static void main(String[] args) {
        Object[] array = {1, 2, new Object[]{3, 4, new Object[]{5}, 6, 7}, 8, 9, 10};

        List<Integer> flattenedList = flatten(array);

        System.out.println(flattenedList);
    }

    public static List<Integer> flatten(Object[] inputArray) {
        List<Integer> resultList = new ArrayList<>();
        for (Object element : inputArray) {
            if (element instanceof Object[]) {
                // If it's a nested array, flatten it
                resultList.addAll(flatten((Object[]) element));
            } else if (element instanceof Integer) {
                // If it's a number, add it to the result list
                resultList.add((Integer) element);
            }
        }
        return resultList;
    }
}
