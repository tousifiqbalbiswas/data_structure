package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.stream.Collectors;

public class ConsumerInterfaceExample {
    public static void main(String[] args) {
        List<String> list2 = Arrays.asList("aaa","cccc","bbbb");


        List<String> list =new ArrayList<>();
        List<Integer> listInt =new ArrayList<>();
        listInt.add(10);
        listInt.add(105);
        listInt.add(100);



        Consumer<String> c1=e->list.add(e);
        Consumer<String> c2=e-> System.out.println(e+"adding in the empty list");



        list2.stream().forEach(c1.andThen(c2));
//

        List<String> names = Arrays.asList("Java", "Python", "Go", "JavaScript");

        // Consumer to print name
        Consumer<String> printName = name -> System.out.println("Name: " + name);
        // Consumer to print length
        Consumer<String> printLength = name -> System.out.println("Length: " + name.length());

        // Stream operation with filter, map, and forEach
        names.stream()
                .filter(name -> name.length() > 4)  // Keep names longer than 4 characters
                .map(String::toUpperCase)          // Convert to uppercase
                .forEach(printName.andThen(printLength));


        List<Integer> collect = listInt.stream().filter(e -> e > 4).sorted((e1, e2) -> Integer.compare(e2, e1)).collect(Collectors.toList());
        System.out.println(listInt);
        System.out.println(collect);

        Optional<Integer> first = listInt.stream().filter(e -> e > 15).sorted((e1, e2) -> Integer.compare(e2, e1)).findFirst();
        System.out.println(first);

    }
}
