package Top50Practice;

import java.util.*;
import java.util.stream.Collectors;

public class SortMapBasedOnValue {

    public static void main(String[] args) {
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(1,10);
        map.put(12,210);
        map.put(13,102);
        map.put(134,910);

        List<Integer>list=new ArrayList<>();
        HashMap<Integer,Integer>res=new HashMap<>();



        Set<Map.Entry<Integer,Integer>> entrySet=map.entrySet();

        for(Map.Entry<Integer,Integer>e:map.entrySet()){
            list.add(e.getValue());
        }

        List<Integer> collect = list.stream().sorted((e1, e2) -> Integer.compare(e2, e1)).collect(Collectors.toList());

        collect.forEach(e->
                {

                }
                );
    }


    public static HashMap<String, Integer> sortByValue(HashMap<String, Integer> hm) {
        // Create a list from elements of HashMap
        List<Map.Entry<String, Integer>> list =
                new LinkedList<Map.Entry<String, Integer>>(hm.entrySet());

        // Sort the list
        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            public int compare(Map.Entry<String, Integer> o1,
                               Map.Entry<String, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        return  null;
    }
}
