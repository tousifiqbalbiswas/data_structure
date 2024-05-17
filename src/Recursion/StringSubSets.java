package Recursion;

import java.util.ArrayList;
import java.util.List;

public class StringSubSets {
    public static void main(String[] args) {
        String s="abc";
        System.out.println(s);
        ArrayList<String>l=findSubSets(s,  "");


        System.out.println(l);
    }

    private static ArrayList<String> findSubSets(String s, String res) {

        if (s.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            System.out.println(res);
            list.add(res);
            return list;
        }

        ArrayList<String>listprev1=findSubSets(s.substring(1),res);
        res=res+s.charAt(0);
        ArrayList<String>listprev2=findSubSets(s.substring(1),res);
        listprev1.addAll(listprev2);
        return listprev1;


    }


}

