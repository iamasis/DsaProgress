package DsaProgress._44_LinkedList;

public class LL {
    private Node head;
    private Node tail;
    private int size;

    public LL(){
        this.size = 0;
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        head = node;
        if(tail == null){
            tail = head;
        }
        size += 1;
    }
    public void insertLast(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size += 1;
    }
    public void insert(int value, int index){
        if(index == 0){
            insertFirst(value);
            return;
        }
        if(index == size){
            insertLast(value);
            return;
        }
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        Node node = new Node(value);// also you can directly pass temp.next then below step is reduced
        node.next = temp.next;
        temp.next = node;
        size++;
    }
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size <= 1){
            return deleteFirst();
        }
        Node secondLast = get(size-2);
        int val = secondLast.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }
    public int delete(int index){
        if(index == 0){
            return deleteFirst();
        }
        if(index == size-1){
            return deleteLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }
    public Node find(int value){
        Node node = head;
        while(node != null){
            if(node.value == value){
                return node;
            }
            node = node.next;
        }
        return null;
    }

    private Node get(int index){
        Node node = head;
        for(int i = 0; i < index; i++){
            node = node.next;
        }
        return node;
    }
    public void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int val, Node node) {
            this.value = val;
            this.next = node;
        }

        public Node(int val) {
            this.value = val;
        }
    }
}
