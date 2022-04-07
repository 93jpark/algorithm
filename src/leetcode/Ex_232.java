package leetcode;

import java.util.Stack;

public class Ex_232 {
    static class MyQueue {

        private Stack<Integer> inStack;
        private Stack<Integer> outStack;

        public MyQueue() {
            this.inStack = new Stack<>();
            this.outStack = new Stack<>();
        }

        /**
         push element x to back of queue
         */
        public void push(int x) {
            inStack.push(x);
        }

        /**
         remove element from front of queue and return it
         */
        public int pop() {
            for(int i=0; i<inStack.size(); i++) {
                outStack.push(inStack.pop());
            }

            int result = outStack.pop();

            for(int i=0; i<outStack.size(); i++) {
                inStack.push(outStack.pop());
            }

            return result;
        }

        /**
         return element at front of queue
         */
        public int peek() {
            for(int i=0; i<inStack.size(); i++) {
                outStack.push(inStack.pop());
            }

            int result = outStack.peek();

            for(int i=0; i<outStack.size(); i++) {
                inStack.push(outStack.pop());
            }


            return result;
        }

        /**
         return true if queue is empty, false otherwise
         */
        public boolean empty() {
            if(inStack.empty()) {
                return true;
            } else {
                return false;
            }
        }

        public void printIn() {
            System.out.println("in");
            System.out.println(this.inStack);
        }

        public void printOut() {
            System.out.println("out");
            System.out.println(this.outStack);
        }
    }

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(1);
        queue.printIn();
        queue.printOut();

        queue.push(2);
        System.out.println();
        queue.printIn();
        queue.printOut();

        System.out.println(queue.peek());
        System.out.println();
        queue.printIn();
        queue.printOut();

        System.out.println(queue.pop());

        System.out.println(queue.empty());

    }
}
