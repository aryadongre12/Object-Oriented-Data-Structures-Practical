public class lab11{
    public static class Node{
        int data;
        Node next;
    
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    
    public static Node head;
    public static Node tail;
    public int size;

    public void addNode(int data){
        Node newnode = new Node(data);
        size++;
    
        if(head == null){           // If LL is empty
            head = tail = newnode;
            return;
        }
    
        Node temp = head;           // If LL is not empty
        while(temp.next != null){
            temp = temp.next;
        }
    
        temp.next = newnode;
        return;
    }

    public int delete(int index){
        if(size == 0){              // If LL is empty
            System.out.println("ll is empty");
            return Integer.MAX_VALUE;
        }
        else if(size == 1){         // if there is only 1 element in LL
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        if (index == 0) {           // If deleting the head node
            int val = head.data;
            head = head.next;
            size--;
            return val;
        }
            
        Node prev = head;
        int i = 0;
        while(i<index-1){
            prev = prev.next;
            i++;
        }

        int val = prev.next.data;
        prev.next = prev.next.next;

        if(index == size - 1){      // If deleting the tail node
            tail = prev;
        }

        size--;
        return val;
    }

    public void print(){
        if(head == null){
            System.out.println("LL is empty");
            return;
        }
    
        Node temp = head;
    
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        lab11 ll = new lab11();
        ll.addNode(1);
        ll.addNode(2);
        ll.addNode(3);
        ll.addNode(4);
        ll.addNode(5);
    
        ll.print();
        System.out.println("Size of Linked list: " + ll.size + "\n");
    
        System.out.println("Data of deleted node: " + ll.delete(2));
        ll.print();
    
        System.out.println("Size of Linked list: " + ll.size);
    }
}
