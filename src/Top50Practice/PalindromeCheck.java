package Top50Practice;

import java.util.Arrays;

public class PalindromeCheck {
    public static void main(String[] args) {
        String s="aba";

        char[] charArray = s.toCharArray();
        String[] split = s.split("");

        System.out.println(Arrays.toString(split));
        boolean palind = palind(s);
        System.out.println(palind);
    }

    private static boolean palind(String s) {

        for (int i=0;i<s.length()/2;i++){
        if (s.charAt(i)!=s.charAt(s.length()-1-i))
            return false;
        }
        return true;
    }
}
