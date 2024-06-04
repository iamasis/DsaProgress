package DsaProgress._44_LinkedList;

public class CLL {
    private Node head;
    private Node tail;
    public int size;
    public CLL(){
        this.size = 0;
        this.head = null;
        this.tail = null;
    }
    public void insertLast(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
        size++;
    }
    public void display(){
        Node temp = head;
        do{
            System.out.print(temp.val+" ->");
            temp = temp.next;
        }while(temp != head);
        System.out.print("End");
    }
    public void delete(int val){
        Node node = head;
        if(node == null){
            return;
        }
        if(node.val == val){
            head = head.next;
            tail.next = head;
            size--;
            return;
        }
        do{
            Node n = node.next;
            if(n.val == val){
                node.next = n.next;
                size--;
                break;
            }
            node = node.next;
        }while(node != head);
    }

    private class Node{
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }
    }
}
