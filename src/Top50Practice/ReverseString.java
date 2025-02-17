package Top50Practice;

import java.util.Arrays;
import java.util.stream.Stream;

public class ReverseString {
    public static void main(String[] args) {
        String s="Tousif";

        StringBuffer sb=new StringBuffer(s);
        sb.reverse();

        //using
        String string = Arrays.stream(s.split("")).reduce((a,b)->b+a).toString();
        System.out.println(string);




    }
}
