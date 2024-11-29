public class LinkedList100{
    class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next =null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data){
        Node nn = new Node(data);
        if(head ==null){
            head = tail = nn;
            return;
        }
        nn.next = head;
        
        
        head = nn;
        return;
        
    }

    public int length(){
        Node n = head;
        int len=0;
        while(n!=null){
            len++;
            n=n.next;
        }
        return len;
    }

    public void addAt(int index,int data){
        Node nn = head;

        if (length()<index) {
            System.out.print("\nOut of bound.");
            return;
        }
        else if(head == null){
            head = tail = nn;
            return;
        }

        for(int i=0;i<index;i++){
            nn = nn.next;
        }
        Node newn = new Node(data);
        newn.next = nn.next;
        nn.next=newn;
    }

    public void addLast(int data){
        Node nn = new Node(data);
        if(head ==null){
            head = tail = nn;
            return;
        }
        tail.next =nn;
        nn.next = null;
        tail = nn;
        return;
    }

    public void display(){
        Node n = head;
        while(n!=null){
            System.out.print(n.data+ " ");
            n=n.next;
        }
    }

    public static void main(String[] args) {
        LinkedList100 ll = new LinkedList100();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(0);
        ll.addLast(6);
        ll.addAt(4,99);
        ll.display();

    }
}