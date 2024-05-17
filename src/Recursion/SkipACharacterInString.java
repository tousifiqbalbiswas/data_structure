package Recursion;

public class SkipACharacterInString {
    public static void main(String[] args) {
        String s="TousifIqbalBiowas";
        String s1 = find(s,'o');

        System.out.println(s1);
    }

    private static String find(String s,Character tar) {




        if (s.length()==0)
            return s;
        Character ch=s.charAt(0);

        if (ch==tar){
          return  ""+ find(s.substring(1),tar);
        }
        else {
            return ch+ find(s.substring(1),tar);
        }




    }

}
