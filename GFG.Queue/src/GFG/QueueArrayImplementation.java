package GFG;

class QueueAL{ //LinearArray
    int cap;
    int size;
    int [] arr;
    QueueAL(int c){
        this.cap=c;
        this.size=0;
        arr= new int[cap];
    }
    int front=-1;
    int rear=-1;

    public void enqueue(int x){
        if(isEmpty()){
            front++;
            rear++;
            size++;
            arr[rear]=x;
        }
        else if(!isFull()){
            rear++;
            size++;
            arr[rear]=x;
        }
        else{
            System.out.print("Queue is Full");
        }
    }

    public int dequeue(){
        int res=Integer.MAX_VALUE;
        if(!isEmpty()) {
            res=arr[front];
            for (int i = 0; i<rear;i++){
                arr[i]=arr[i+1];
            }
            arr[rear]=0;
            rear--;
            size--;
        }
        return res;
    }

    public int getFront(){
        return arr[front];
    }
    public int getRear(){
        return arr[rear];
    }
    public boolean isFull(){
        return size==cap;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int size(){
       return size;
    }
}

class QueueAC{ //CircularArray
    int cap;
    int size;
    int [] arr;
    int front;
    QueueAC(int c){
        this.cap=c;
        this.size=0;
        this.front=0;
        arr= new int[cap];
    }

    public void enqueue(int x){
        if(isFull()){
            return;
        }
        int rear=getRear();
        rear=(rear+1)%cap;
            arr[rear]=x;
            size++;
    }

    public void dequeue(){
        if(isEmpty()){
            return;
        }
       front=(front+1)%cap;
        size--;
    }

    public int getFront(){
        if(isEmpty()){
            return -1;
        }
        return front;
    }
    public int getRear(){
        if(isEmpty()){
            return -1;
        }
        return (front+size-1)%cap;
    }
    public boolean isFull(){
        return size==cap;
    }
    public boolean isEmpty(){
        return size==0;
    }
    public int size(){
        return size;
    }
}

public class QueueArrayImplementation {
    public static void main(String [] args){

        QueueAL s= new QueueAL(10);
        System.out.println(s.isEmpty());
        s.enqueue(5);
        s.enqueue(10);
        System.out.println(s.getFront());
        s.enqueue(15);
        System.out.println(s.isEmpty());
        System.out.println(s.dequeue());
        System.out.println(s.getFront());
        System.out.println(s.getRear());
        s.enqueue(20);
        System.out.println(s.getRear());
        System.out.println(s.size());

        QueueAL s2= new QueueAL(10);
        System.out.println(s2.isEmpty());
        s.enqueue(5);
        s.enqueue(10);
        System.out.println(s2.getFront());
        s.enqueue(15);
        System.out.println(s2.isEmpty());
        System.out.println(s2.dequeue());
        System.out.println(s2.getFront());
        System.out.println(s2.getRear());
        s.enqueue(20);
        System.out.println(s2.getRear());
        System.out.println(s2.size());

    }
}
