package Top50Practice;

import java.util.Arrays;

public class VowelPresent {
    public static void main(String[] args) {
        String word="hgdsvcgashdfvdsgh";
        char[]arr={'a','e','i','o','u'};

        for (int i=0;i<word.length();i++) {

           if (word.charAt(i)=='a'||
                   word.charAt(i)=='u'||
                   word.charAt(i)=='e'||
                   word.charAt(i)=='i'||
                   word.charAt(i)=='o'){
               System.out.println(word.charAt(i)+"is a vowel");
           }
        }
    }
}
