package DsaProgress._44_LinkedList;

public class DLL {
    private Node head;
    private Node tail;

    public DLL() {
    }
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }
    public void display(){
        Node temp = head;
        Node last = null; // for reverse printing
        while(temp != null){
            System.out.print(temp.val+" ->");
            last = temp;
            temp = temp.next;
        }
        System.out.print(" End");
//        System.out.println();
//        while(last != null){
//            System.out.print(last.val+" ->");
//            last = last.prev;
//        }
//        System.out.print("Start");
    }
    public void insertLast(int val){
        Node node = new Node(val);
        if(head == null){
            node.prev = null;
            head = node;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        node.next = null;
    }
    public void insertAfter(int after, int InsertVal){
        Node prev = get(after);
        Node node = new Node(InsertVal);

        node.next = prev.next;
        prev.next = node;
        node.prev = prev;
        prev.next.prev = node;
        if(node.next != null){
            node.next.prev = node;
        }
    }

    // Insert after a certain value in DLL
    private Node get(int val){
        Node temp = head;
        while(temp.val != val){
            temp = temp.next;
        }
        return temp;
    }


    private class Node{
        private int val;
        private Node next;
        private Node prev;

        private Node(int val){
            this.val = val;
        }
    }
}
