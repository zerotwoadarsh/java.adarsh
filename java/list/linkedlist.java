package list;


public class linkedlist {

    private Node head;
    private Node tail;
    private int size;
    
    public linkedlist() {
        this.size=0; 
    }

    // inserting the element at first
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;
        
        if(tail == null){
            tail = head;
        }
    }
    
    // inserting the element at desired index
    public void insertAtIndex(int val, int index){
        if (index == 0){
            insertFirst(val);
            return;
        }
        
        if(index == size){
            insertLast(val);
            return;
        }
        Node temp = head;
        for(int i = 1; i < index; ++i){
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        ++size;
    }

    // inserting the element at last
    public void insertLast(int val){
       if(tail == null){
        insertFirst(val);
       }
       
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        ++size;
    }



    //deleting the first element
    public int deleteFirst(){
        int val = head.value;
        
        head = head.next;
        if(head == null){
            tail = null;
        }
        --size;
        return val;
    }

    
    //deleting the last element
    public int deleteLast(){

        if (size <=1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        tail = secondLast;
        tail.next = null;

        return secondLast.value;
    }
    public Node get(int index){
        Node node = head;
        for(int i = 0; i<index; ++i){
           node = node.next;
        }
        return node;
    }
    // printing the node
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("end");
        System.out.println();

    }

    private class Node{
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

        
    }


    public static void main(String[] args) {
        linkedlist list = new linkedlist();
        list.insertFirst(99);
        list.insertFirst(89);
        list.insertFirst(33);
        list.insertFirst(39);
        list.insertFirst(9);

        list.insertLast(49);
        list.insertLast(12);
        list.insertLast(90);
        list.insertLast(34);

        // list.print();
        
        // list.insertAtIndex(100,3);

        // list.print();

        // System.out.println(list.deleteFirst());
        // list.print();
        
        // System.out.println(list.deleteLast());
        list.print();
    }
}
