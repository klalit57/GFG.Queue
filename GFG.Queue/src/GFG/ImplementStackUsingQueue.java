package GFG;

import java.util.Queue;
import java.util.*;

class Stack{
    Queue<Integer> q1;
    Queue<Integer> q2;
    public int top(){
        return q1.peek();
    }
    public int size(){
        return q1.size();
    }
    public void push(int data){
        while(!q1.isEmpty()){
            q2.offer(q1.poll());
        }
        q1.offer(data);
        while(!q2.isEmpty()){
            q1.offer(q2.poll());
        }
    }
    public int pop(){
        return q1.poll();
    }

}

public class ImplementStackUsingQueue {
    public static void main(String [] args){

    }
}
