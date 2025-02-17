package LeetcodeProblems;

import com.sun.source.tree.IfTree;

public class StringEx {

    public static void main(String[] args) {

        String s="aabbccdd";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            for (int j=0;j<s.length();j++){
                if (!String.valueOf(c).equals(String.valueOf(s.charAt(j)))&&j!=i){
                    System.out.println(c);
                    return;
                }if (String.valueOf(c).equals(String.valueOf(s.charAt(j)))&&j==s.length()-1){
                    System.out.println(c);

                    return;
                }

                else  if (String.valueOf(c).equals(String.valueOf(s.charAt(j)))&&i!=j){
                    break;
                }

            }
        }


        int theIndex = findTheIndex(0, "sadbutsad", "sad");
        System.out.println(theIndex);
    }

    private static int findTheIndex(int start, String input, String tar) {
        if (start+tar.length()>input.length())return -1;
        int len=input.length();

        String sub=input.substring(start,start+3);
      if (tar.equals(sub)){
          return start;
      }
       return findTheIndex(start+1,input,tar);

    }
}
