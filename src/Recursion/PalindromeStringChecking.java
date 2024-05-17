package Recursion;

public class PalindromeStringChecking {
    public static void main(String[] args) {
        check("aba",0,2);
    }
    public static boolean check(String str,int start,int end){
        if(start>end) return true;
        if(str.charAt(start)==str.charAt(end)) {
            return check(str,++start,--end);
        }
        else return false;

    }
}
