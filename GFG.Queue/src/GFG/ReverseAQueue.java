package GFG;

import java.util.Queue;
import java.util.Stack;

public class ReverseAQueue {
    public void reverseQueue1(Queue<Integer> q){  //GFG iterative
        Stack<Integer> s= new Stack<>();
        while(!q.isEmpty()){
            s.push(q.poll());
        }
        while(!s.isEmpty()){
            q.offer(s.pop());
        }
    }

    public void reverseQueue2(Queue<Integer> q){ //GFG Recursive
        if(q.isEmpty()){
            return;
        }

        int x=q.poll();

        reverseQueue2(q);
        q.offer(x);
    }

    public static void main(String [] args){

    }
}
