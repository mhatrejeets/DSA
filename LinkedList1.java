public class LinkedList1{
    public static class Node{
        int value;
        Node  next;

        Node(int value){
            this.value = value;
            this.next = null;
        }
        
    }

    public static Node head;
    public static Node tail;

    public static void addFirst(int value){
        
        Node newNode = new Node(value);
        
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        
    }

    public static void addLast(int value){
        Node  newNode = new Node( value);

        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public static void addMiddle(int index, int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = tail = newNode;
            return; 
        }
    
        int counter = -1;
        Node temp = head;
        Node tempNext = null; 
    
        while (temp != null && counter < index - 1) { 
            tempNext = temp;
            temp = temp.next;
            counter++;
        }
    
        if (counter != index - 1) { 
            System.out.print("\nOut of bound.");
            return;
        }
    
        
        tempNext.next = newNode;
        newNode.next = temp;
    }
    

    public static void display(){
        Node  temp = head;
        System.out.println("");
        while(temp != tail){
            System.out .print(temp.value + " ");
            temp = temp.next;
        }
    }

    public static int  length (){
        Node temp = head;
        int len = 0;
        while(temp != tail){
            temp = temp.next;
            len ++;

        }
        return len;
    }

    public static int removeFirst(){
        if(head == null){
            System.out.println("The Linked List is Null");
            return -1;
        }
        int data = head.value;
        head = head.next;
        return data;
    }

    public static int removeLast(){
        if(head == null){
            System.out.println("The Linked List is Null");
            return -1;
        }
        Node temp = head;

        while(temp.next != tail){
            temp = temp.next;
        }
        int data = temp.value;
        temp.next = null;
        tail = temp;
        return data;
    }

    public static boolean search(int key){
        Node temp = head;

        while(temp != null){
            if(temp.value == key){
                return true;
            }
            temp = temp.next;
        }

        return false;
    }

    public static boolean recursiveSearch(Node temp, int key){
        if(temp == null){
            return false;
        }
        if(temp.value == key){
            return true;
        }
        else{
            return recursiveSearch(temp.next, key);
        }
    }

    public static void reverseLL(){
        
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;
    }

    public static int removeNthNodeFromEnd(int index){
        if(head == null){
            System.out.println("\nHead is empty");
            return -1;
        }
        if(length()<= index){ 
            System.out.println("Out of bound");
            return -1;

        }
        int totalIter = length() - index ;
        Node prev = head;
        for(int i = 0; i<totalIter-1; i++){
            prev = prev.next;
        }
        Node curr = prev.next;
        prev.next = curr.next;
        return curr.value;
    }

    public static void main (String args []){
        LinkedList1 ll = new LinkedList1();
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addLast(4);
        ll.addLast(5);
        ll.addLast(6);
        ll.addMiddle(3,55);
        ll.display();
        System.out.println("\n Length : " + length());
        ll.removeFirst();
        ll.removeLast(); 
        ll.display();
        System.out.println("\n Length : " + length());
        System.out.println(ll.search(33));
        System.out.println(ll.recursiveSearch(head ,34));
        ll.reverseLL();
        ll.display();
        System.out.println("\n Length : " + length());
        ll.removeNthNodeFromEnd(2);
        System.out.println("\n Length : " + length());
        ll.display();


    }
}