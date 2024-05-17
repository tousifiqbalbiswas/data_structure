

public class RemovingAPerticularCharInAString {
   static String s=new String("abahdhdhdhahdfhfh");
    public static void main(String[] args) {

        //remove c from the string
        int length=s.length();
        remove(s,0,length);
        System.out.println(s);

    }

    private static void remove(String s,int start,int end) {

        if(start>=end) {
            System.out.println(s);
            return;
        }


/*        if(start==0&&s.charAt(0)=='a') {
            s=s.substring(start+1,end);
//            start++;
            end--;
            remove(s,start,end);
        }*/
        if(s.charAt(start)=='a') {
            RemovingAPerticularCharInAString.s=s.substring(0,start)+s.substring(start+1,end);
            start++;
            end--;
            s=RemovingAPerticularCharInAString.s;
            remove(s, start, end);
        }
        else {
            start++;
            remove(s,start,end);
        }

    }
}
