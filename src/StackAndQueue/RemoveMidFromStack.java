package StackAndQueue;

import java.util.LinkedList;
import java.util.Stack;

public class RemoveMidFromStack {
    //
        public void deleteMid(Stack<Integer> s, int n) {
            int count = 0;
            fun(s, count, n);

            // code here
        }

        public void fun(Stack<Integer> s, int count, int n) {

            if (count == n / 2) {
                s.pop();
                return;
            }
            int top = s.peek();
            s.pop();
            count++;
            fun(s, count, n);
            s.push(top);
        }
    }


