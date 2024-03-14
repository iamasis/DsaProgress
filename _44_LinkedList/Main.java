package DsaProgress._44_LinkedList;

public class Main {
    public static void main(String[] args) {
//        LL list = new LL();
//        list.insertFirst(10);
//        list.insertFirst(20);
//        list.insertFirst(15);
//        list.insertFirst(14);
//        list.insertLast(20);
//        list.display();
//        list.insert(10, 2);
//        list.display();
//        System.out.println(list.deleteFirst());
//        list.display();
//        list.deleteLast();
//        list.display();
//        list.delete(2);
//        list.display();
//        System.out.println(list.find(15));


//        DLL list = new DLL();
//        list.insertFirst(20);
//        list.insertFirst(10);
//        list.insertFirst(22);
//        list.insertFirst(13);
//        list.display();
//        System.out.println();
//        list.insertLast(25);
//        list.insertLast(22);
//        list.display();
//        System.out.println();
//        list.insertAfter(10, 11);
//        list.insertAfter(11, 12);
//        list.display();


        CLL list = new CLL();
        list.insertLast(20);
        list.insertLast(15);
        list.insertLast(11);
        list.insertLast(12);
        list.display();
        System.out.println();
        list.delete(12);
        list.display();
    }
}
