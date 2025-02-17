package Recursion;

public class SkipAString {
    public static void main(String[] args) {

        String s="tousifIqbal";
        System.out.println("testing the subsrting index"+s.substring(11,s.length()));

        String res="";
        for (int i=0;i<s.length();i++){

            if (s.substring(i,i+3).equals("sif")) {
                res = s.substring(0, i) + s.substring(i + 3, s.length());
                break;
            }
        }
        System.out.println(res);


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
