package ArrayDataStructure;

class P1 {
    P1() {
        this("Constructor");
        System.out.println("Parent class Default Constructor");
    }

    P1(String s) {
        System.out.println("Parent Class Param " + s);
    }
}

public class SampleQ1 extends P1 {
    SampleQ1() {
        super("Constructor");
        System.out.println("Child Class Default Constructor");
    }

    public static void main(String[] args) {
        SampleQ1 obj = new SampleQ1();
    }
}
