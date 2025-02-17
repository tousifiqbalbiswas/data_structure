package LeetcodeProblems.StringProblems;

public class FindFirstUniqueCharInString {
    public static void main(String[] args) {
        String s="aabbccde";


        char res = findPlace(s);
        System.out.println(res);
    }

    private static char findPlace(String s) {
        if (s.length()==1)return s.charAt(0);
        for (int i=0;i<s.length();i++){
            char c=s.charAt(i);
           boolean isMatched=false;
            for (int j=0;j<s.length();j++){
//                if (j==s.length()-1 && c==s.charAt(j))return s.charAt(i);
//                if (s.charAt(j)==c && i!=j) break;
                if (s.charAt(j)==c && i!=j) isMatched=true;
            }
            if (!isMatched)return s.charAt(i);
        }
        return 'X';
    }
}


