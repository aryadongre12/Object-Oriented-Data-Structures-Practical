class Queue{
    int front;
    int rear;
    int size;
    int[] queue;

    Queue(int maxsize){
        front = rear = 0;
        size = maxsize;
        queue = new int[size];
    }

    public boolean isFull(){
        return (rear == size);
    }

    public boolean isEmpty(){
        return (front == rear);
    }

    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full: " + data);
            System.out.println();
            return;
        }
        else{
            queue[rear] = data;
            System.out.println("Enqueued Element: " + data);
            rear++;
        }
        return;
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            System.out.println();
            return;
        }
        else{
            int val = queue[front];
            System.out.println("Dequeued Element: " + val);

            for(int i=0; i<rear-1; i++){
                queue[i] = queue[i+1];
            }

            if(rear < size){
                queue[rear] = 0;
            }
            rear--;
        }
        return;
    }

    public void print(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            System.out.println();
            return;
        }

        System.out.print("Contents of Queue: ");

        for(int i=front; i<rear; i++){
            System.out.print(queue[i] + " ");
        }
        System.out.println();
        return;
    }

    public void printFront(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            System.out.println();
            return;
        }

        System.out.println();
        System.out.println("Front Element: " + queue[front]);
        System.out.println();
        return;
    }
}


public class lab10 {
    public static void main(String[] args) {
        Queue q = new Queue(3);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        q.enqueue(4);

        q.printFront();
        q.print();

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}
