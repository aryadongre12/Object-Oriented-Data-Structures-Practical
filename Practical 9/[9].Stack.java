public class lab9 {
    int maxSize;
    int[] Stack;
    int top;

    public lab9(int size) {
        this.maxSize = size;
        this.Stack = new int[maxSize];
        this.top = -1;
    }

    public void push(int element){
        if(isFull()){
            System.out.println("Stack Overflow: " + element);
        } 
        else{
            top++;
            Stack[top] = element;
            System.out.println("Pushed element: " + element);
        }
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack Underflow.");
            return -1;
        } 
        else{
            int popout = Stack[top];
            top--;
            
            System.out.println("Popped element: " + popout);
            return popout;
        }
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public boolean isEmpty() {
        return (top == -1);
    }
    
    public static void main(String[] args) {
        lab9 stack = new lab9(3);

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
    }
}
