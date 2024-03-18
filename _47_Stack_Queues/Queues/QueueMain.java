package DsaProgress._47_Stack_Queues.Queues;

public class QueueMain {
    public static void main(String[] args) throws QueueException {
//        CustomQueue queue = new CustomQueue(4);
//        queue.insert(10);
//        queue.insert(20);
//        queue.insert(30);
//        queue.insert(40);
//        queue.display();
//        System.out.println();
//        queue.remove();
//        queue.display();
//        System.out.println();
//        queue.insert(50);
//        System.out.println();
//        queue.display();
//        CircularQueue queue = new CircularQueue(5);
//        queue.insert(10);
//        queue.insert(20);
//        queue.insert(30);
//        queue.insert(40);
//        queue.insert(50);
//        queue.removed();
//        queue.insert(30);
//        queue.display();

        DynamicCircularQueue queue = new DynamicCircularQueue(2);
        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.insert(40);
        queue.display();
    }
}
