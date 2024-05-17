package StringDataStructure;

import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {
        String s="abc";
        String processed="";
        ArrayList<String>list=new ArrayList<>();
       // subSetRecursion(s,processed);
//        subSetRecursionStoringInArrayList(s,processed,list);
        ArrayList<String>res= subSetRecursionStoringInArrayList(s,processed);
        System.out.println("mylist is"+res+"end");

    }

    private static void subSetRecursion(String s,String processed) {
        if (s.isEmpty()){
            System.out.println(processed);
            return ;
        }
        char ch=s.charAt(0);
//        subSetRecursion(s.substring(1),processed+String.valueOf(ch));
        subSetRecursion(s.substring(1),processed+ch);
        subSetRecursion(s.substring(1),processed);
    }

    private static ArrayList<String> subSetRecursionStoringInArrayList(String s,String processed,ArrayList<String>list) {
        if (s.isEmpty()){
            System.out.println(processed);
            list.add(processed);
            return list  ;
        }
        char ch=s.charAt(0);
//        subSetRecursion(s.substring(1),processed+String.valueOf(ch));
        subSetRecursionStoringInArrayList(s.substring(1),processed+ch,list);
        subSetRecursionStoringInArrayList(s.substring(1),processed,list);
        return list;
    }
    private static ArrayList<String> subSetRecursionStoringInArrayList(String s,String processed) {
        ArrayList<String>list=new ArrayList<>();
        if (s.isEmpty()){
            list.add(processed);
            return list  ;
        }
        char ch=s.charAt(0);
//        subSetRecursion(s.substring(1),processed+String.valueOf(ch));
        ArrayList<String>listLeft
                =subSetRecursionStoringInArrayList(s.substring(1),processed+ch);
        ArrayList<String>listRight
                =subSetRecursionStoringInArrayList(s.substring(1),processed);

       listLeft.addAll(listRight);
       return listLeft;
    }


}
