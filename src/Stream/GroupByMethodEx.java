package Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByMethodEx {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();

        // Adding some sample customers
        customers.add(new Customer(101, "John Doe", 30, "john.doe@example.com", "New York"));
        customers.add(new Customer(102, "Jane Smith", 28, "jane.smith@example.com", "Los Angeles"));
        customers.add(new Customer(103, "David Johnson", 35, "david.johnson@example.com", "Chicago"));
        customers.add(new Customer(104, "Emily Brown", 25, "emily.brown@example.com", "Houston"));
        customers.add(new Customer(108, "Emily Brown", 25, "emily.brown@example.com", "Houston"));
        customers.add(new Customer(105, "Michael White", 40, "michael.white@example.com", "San Francisco"));


        Map<Object, Long> collect = customers.stream()
                .filter(e -> e.getAge() <= 30)
                .collect(Collectors.groupingBy(e -> e.getAge() ,Collectors.counting()                ));

        System.out.println(collect);

    }
}
