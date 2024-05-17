package Recursion;

public class PrintTheAllPaths {
    public static void main(String[] args) {
    paths(3,3,"");
    }
    public static void paths( int r,int c,String p ) {
        if (r==1&&c==1){
            System.out.println(p);
            return;
        } ;
        if (c>1){
            paths(r,c-1,p+"R");

        }
        if (r>1){
            paths(r-1,c,p+"L");
        }


    }
}
