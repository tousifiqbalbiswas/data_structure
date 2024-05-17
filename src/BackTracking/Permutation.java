package BackTracking;

import java.util.ArrayList;
import java.util.Arrays;

public class Permutation {
    public static void main(String[] args) {
        int[]arr={1,2,3};
        String s="123";
        Integer i= Integer.parseInt(s);

        find("123"," ");
    }

    private static ArrayList<Integer> find(String up,String p) {

        ArrayList<Integer> res=new ArrayList<>();
        if (up.isEmpty()){
            System.out.println(p);
            Integer i = Integer.parseInt(p);

            ArrayList<Integer>list=new ArrayList<>();
            list.add(i);
            return list;
        }
        char ch=up.charAt(0);

        for (int i=0;i<=p.length()-1;i++){
            String s = p.substring(0, i) + ch + p.substring(i,p.length());
            ArrayList<Integer> prev=find(up.substring(1),s);
            res.addAll(prev);
        }
        return res;
    }
}
