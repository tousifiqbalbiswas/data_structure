package RoughPractices;

import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class RoughClassPractices extends Parent {
     String name;
//    String name2=
    @Override
    public int hashCode() {
        return name.hashCode();
    }

    public static void main(String[] args) {

        RoughClassPractices e1=new RoughClassPractices();

        e1.name="tousif";
        RoughClassPractices e2=new RoughClassPractices();


        e2.name="tousif";


        System.out.println(e1.hashCode() +"and"+ e2.hashCode());
        System.out.println(e1.equals(e2));
        Parent child=new RoughClassPractices();
        Parent roughClassPractices=new RoughClassPractices();
        Parent parent=new Parent();
        child.show();







        ArrayList ar=new ArrayList<>();
        ar.add(12);
        ar.add(22);
        ar.add(122);
        Iterator iterator1 = ar.iterator();

        Iterator<Integer>it=ar.iterator();
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        Set< Entry<String, String> > entries = capitalCities.entrySet();

        for (Entry<String,String> en:capitalCities.entrySet()){
            en.getKey();
            en.getValue();
        }

        Iterator<  Entry<String, String>  > iterator = capitalCities.entrySet().iterator();

//       while (iterator.hasNext()){
//
//           System.out.println(iterator.next().getValue());
//           capitalCities.put("India","Delhi");
//       }

       // concurent hashmap
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<String, String>();

        // Add keys and values (Country, City)
        concurrentHashMap.put("England", "London");
        concurrentHashMap.put("Germany", "Berlin");
        concurrentHashMap.put("Norway", "Oslo");
        concurrentHashMap.put("USA", "Washington DC");

        Iterator<  Entry<String, String>  > iterator2 = concurrentHashMap.entrySet().iterator();

        while (iterator2.hasNext()){

            System.out.println(iterator2.next().getValue());
            concurrentHashMap.put("India","Delhi");
        }

    }
}
