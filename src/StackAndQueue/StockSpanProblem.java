package StackAndQueue;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Stack;

public class StockSpanProblem {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1};
        int[] r=stockSpan(arr);
        System.out.println(Arrays.toString(r));
    }

    static int[] stockSpan(int arr[]) {
        int[]res=new int[arr.length];
        res[0]=1;
        Stack<Integer> s = new Stack<>();
        s.push(0);
        for (int i=1;i<arr.length;i++){
            int ele=arr[i];
            while(!s.empty()){
                int stackEle=s.peek();
                if (arr[stackEle]<=ele){
                    s.pop();
                }
                //stackEle>ele
                else {
                    break;
                }
            }
            if (s.empty()){
                //1 1 1 1 1
               res[i]=i+1;
            }
            else {
                res[i]=i-s.peek();
            }
         s.push(i);
        }
        return res;
    }


//    static int[] stockSpan(int a[]) {
//
//        int n = a.length;
//
//        int s[] = new int[n];
//        s[0] = 1;
//
//        ArrayDeque<Integer> stack = new ArrayDeque<>();
//        stack.push(0);
//        for (int i = 1; i < n; i++) {
//            while (!stack.isEmpty()) {
//                int top = stack.peek();
//
//                if (a[top] > a[i]) {
//                    break;
//
//                } else {
//
//                    stack.pop();
//
//                }
//
//                if (stack.isEmpty()) {
//
//                    s[i] = 1;
//
//                } else {
//                    s[i] = i - stack.peek();
//                }
//
//            }
//            stack.push(i);
//
//
//        }
//       return s;
//
//    }
}

