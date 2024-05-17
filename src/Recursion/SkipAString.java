package Recursion;

public class SkipAString {
    public static void main(String[] args) {
        System.out.println(skipAString("tousifiqbalbiswas","was"));
    }
    private static String skipAString(String s,String tar) {




        if (s.length()==0)
            return s;


        if (s.length()>=tar.length()&&s.substring(0,tar.length()).equals(tar)){
            return  ""+ skipAString(s.substring(tar.length()),tar);
        }
        else {
            return s.charAt(0)+ skipAString(s.substring(1),tar);
        }




    }

}
