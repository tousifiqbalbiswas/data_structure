package RoughPractices;

import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuntionalInterface {
    public static void main(String[] args) {

        MyInterface myInterface=()->5;
        int res=myInterface.testMethod();
        System.out.println(res);

        Predicate<Integer> p=(input)->input>4;
        p.test(34);

        Supplier s=()->88;

    }


    protected void method1(){

    }
}
interface MyInterface{
    int testMethod();
}
