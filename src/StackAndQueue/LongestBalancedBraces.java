package StackAndQueue;

import java.util.Stack;

public class LongestBalancedBraces {
    public static void main(String[] args) {
        int i = longestValidParentheses("()");
        System.out.println(i);
    }

    public static int longestValidParentheses(String str)
    {
        //You can code here
        int max=-1;
        char[]arr=str.toCharArray();
        int exclude=-1;
        Stack<Integer>s=new Stack<>();
        for (int i=0;i<arr.length;i++){
            char cur=arr[i];
            if (cur=='['||cur=='('||cur=='{'){
                s.push(i);
            }
            else {
                if (s.empty())
                    exclude=i;
                else{

                    if (cur==')'&&arr[s.peek()]=='(') {
                        s.pop();
                        if (s.empty())
                           max= Math.max(max,i-exclude);
                        else{
                            max=Math.max(max,i-s.peek());
                        }
                    }

                    else if (cur=='}'&&arr[s.peek()]=='{'){
                        s.pop();
                        if (s.empty())
                           max= Math.max(max,i-exclude);
                        else{
                            max=Math.max(max,i-s.peek());
                        }
                    }

                    else if (cur==']'&&arr[s.peek()]=='['){
                        s.pop();

                        if (s.empty())
                           max= Math.max(max,i-exclude);
                        else
                       max= Math.max(max,i-s.peek());
                    }

                    else {
                        exclude=i;
                    }

                }
            }



        }


    return max;
    }
}
