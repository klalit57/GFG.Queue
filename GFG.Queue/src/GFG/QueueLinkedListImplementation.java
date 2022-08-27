package GFG;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}

class QueueLL{
    Node front;
    Node rear;
    QueueLL(){
        this.front=null;
        this.rear=null;
    }
    public void enqueue(int data){
        Node newNode= new Node(data);
        if(front==null) {
            front=newNode;
            rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=newNode;
    }
    public void dequeue(){
        if(front==null){
            return;
        }
        front = front.next;
        if(front==null){
            rear=null;
        }
    }
    public boolean isEmpty(){
        return front==null;
    }
}
public class QueueLinkedListImplementation {


    public static void main(String [] args){

    }
}
