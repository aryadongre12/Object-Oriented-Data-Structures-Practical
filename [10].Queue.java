class Queue {
	int front;
    int rear;
    int size;
	int queue[];

	Queue(int c){
		front = rear = 0;
		size = c;
		queue = new int[size];
	}

	void enqueue(int data){
		if (isFull()){
			System.out.println("Queue is full: " + data);
            System.out.println();
			return;
		}
		else{
			queue[rear] = data;
            System.out.println("Enqueued element: " + queue[rear]);
			rear++;
		}
		return;
	}

	void dequeue(){
		if (isEmpty()){
			System.out.println("Queue is empty");
            System.out.println();
			return;
		}
		else{
            int val = queue[0];
            System.out.println("Dequeued element: " + val);

			for (int i=0; i<rear-1; i++) {
				queue[i] = queue[i + 1];
			}

			if (rear < size){
				queue[rear] = 0;
			}
			rear--;
		}
		return;
	}

    public boolean isFull() {
        return (size == rear);
    }

    public boolean isEmpty() {
        return (front == rear);
    }

	void print(){
		if (isEmpty()) {
			System.out.println("Queue is Empty");
			System.out.println();
            return;
		}

        System.out.print("Contents of queue: ");

		for (int i=front; i<rear; i++){
			System.out.print(queue[i] + " ");
		}
        System.out.println();
		return;
	}

	void printFront(){
		if (isEmpty()) {
			System.out.println("Queue is Empty");
            System.out.println();
			return;
		}
		System.out.println("Front Element is: " +  queue[front]);
		return;
	}
}

public class lab10 {
	public static void main(String[] args){
		Queue q = new Queue(3);
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.enqueue(40);

        q.printFront();
        q.print();

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
	}
}
