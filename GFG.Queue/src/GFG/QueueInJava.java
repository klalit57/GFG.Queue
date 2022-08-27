package GFG;
import java.util.*;

public class QueueInJava {
    public static void main(String [] args){
        Queue<Integer> p= new LinkedList<Integer>();
        Queue<Integer> q= new ArrayDeque<Integer>();

        p.offer(10);  //offer Method Add last of an queue
        p.offer(20);
        p.offer(30);
        System.out.println(p.size());  //size method return int

        System.out.println(p.isEmpty());  //isEmptyMethod return boolean

        System.out.println(p);//print the whole queue

        System.out.println(p.peek()); //peek Method return first item of the queue

        System.out.println(p.poll());  //poll method remove first item, return it and make the second item as first

        System.out.println(p.peek());
        System.out.println(p.element());  //same as peek return first element but throws exception

        p.offer(30);
        p.add(40); //same as offer add element to last

        System.out.println(p.poll());
        System.out.println(p.remove());  //same as poll it removes first element but throws exception

        System.out.println(p);

    }
}
