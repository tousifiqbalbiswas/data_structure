package Practice;

import java.util.Scanner;

public class ArrayInputExample {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input=sc.nextLine().trim();// my name is tousif Iqwbal Bos
        String[] split = input.split("\\s");
        boolean isInteger=true;
        try {
            for (String e:split){
                Integer.parseInt(e);
            }
        }
        catch (Exception ex){
            isInteger=false;
        }
        if (isInteger){
            Integer[]nums=new Integer[split.length];
            for (String e:split){
                int i=0;
                nums[i]=Integer.parseInt(e);
                ++i;
            }
        }



    }

}
