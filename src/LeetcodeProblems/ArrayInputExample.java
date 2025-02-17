package LeetcodeProblems;

class Solution {
    public static void main(String[] args) {
        strStr("sadbutsad","sad");
    }
    public static int strStr(String haystack, String needle) {
        return findTheIndex(0,haystack,needle);
    }

    private static int findTheIndex(int start, String input, String tar) {
        if (input.length()<tar.length())return -1;
        if (tar.equals(input.substring(start,start+3))){
            return start;
        }
        return findTheIndex(start+1,input,tar);

    }
}
