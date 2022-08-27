package GFG;

import java.util.LinkedList;
import java.util.Queue;

public class GenerateNumberWithGivenDigit {
    public static void generatedNumber(int x, int y,int z, int n){
        Queue<Integer> q= new LinkedList<>();

        q.offer(x);
        q.offer(y);
        q.offer(z);

        for(int i=0;i<n;i++){
            int curr=q.poll();
            System.out.print(curr+" ");
            q.offer(curr*10+x);
            q.offer(curr*10+y);
            q.offer(curr*10+z);
        }
    }

    public static void main(String [] args){
        generatedNumber(5,6,7,20);
    }
}
