package Top50Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SortAnHashMapByValue {

    public static void main(String[] args) {

        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities.entrySet());

        Set< Map.Entry<String, String> > entries = capitalCities.entrySet();
        for ( Map.Entry<String,String> e : capitalCities.entrySet() ) {





       }





    }

    private static void sorting(HashMap<String, Integer> map) {


        Set<  Map.Entry<String, Integer>  > entries = map.entrySet();


    }
}
