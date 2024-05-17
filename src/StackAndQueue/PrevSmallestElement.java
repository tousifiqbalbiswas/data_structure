package StackAndQueue;
import java.util.*;
public class PrevSmallestElement {

    public static void main(String[] args) {
        ArrayList<Integer>list=new ArrayList<>();
        int[] values = {-36, 72, 57, 12, -76, 51, -46, -17, 93, -92, -96, -60, 57, 8, -98, 34, 62, 77, 68, 39, -71, 0, 73, 49, 78, 37, 32, 56, 4, -20, 89, 88, -71, 37, 60, -82, 76, -1, -59, 75, -81, -98, -8, -2};

        Deque<Integer> stack = new ArrayDeque<>();

        for (int value : values) {
            list.add(value);
        }

//        list.add(0);
//        list.add(-63);
//        list.add(15);
//        list.add(-35);
//        list.add(37);
//        list.add(1);
//        list.add(9);
        System.out.println(prevSmaller(list));
    }
    public static ArrayList<Integer> prevSmaller(ArrayList<Integer> arr)
    {
        Stack<Integer> s=new Stack<>();
        ArrayList<Integer> res=new ArrayList<>();
        s.push(arr.get(0));
        res.add(-1);

        //You can code here
        for(int i=1;i<arr.size();i++){
           int cur= arr.get(i);
            while(!s.empty()){
                if(s.peek()<cur){
                    res.add(s.peek());
                    s.push(cur);
                    break;
                }
                else if(s.peek()>cur){
                    s.pop();
                }
            }
            if (s.empty()){
                res.add(-1);
            }
            s.push(cur);


        }
        return res;
    }
    /*
     public static ArrayList<Integer> prevSmaller(ArrayList<Integer> arr)
    {
         Stack<Integer> s=new Stack<>();
        ArrayList<Integer> res=new ArrayList<>();
        s.push(arr.get(0));
        res.add(-1);

        //You can code here
        for(int i=1;i<arr.size();i++){
           int cur= arr.get(i);
            while(!s.empty()){

                 if(s.peek()>cur){
                    s.pop();
                    continue;
                }
                 else if(s.peek()<cur){
                    res.add(s.peek());
                    s.push(cur);
                    break;
                }
            }
            if (s.empty()){
                res.add(-1);
            }
            s.push(cur);


        }
        return res;



    }
     */
}
