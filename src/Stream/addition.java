package Stream;

import java.sql.Array;

public class addition {
    public  int test(int n1,int n2) {
      return n2+n1;
    }

    public static void main(String[] args) {
        addition object=new addition();
        int x = object.test(10, 20);
        System.out.println(x);
       


    }
}
