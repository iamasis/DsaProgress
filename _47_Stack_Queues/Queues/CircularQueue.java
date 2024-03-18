package DsaProgress._47_Stack_Queues.Queues;

public class CircularQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    public int end = 0;
    public int front = 0;
    public int size = 0;
    public CircularQueue() {
        this(DEFAULT_SIZE);
    }
    public CircularQueue(int size){
        this.data = new int[size];
    }
    public boolean insert(int item) throws QueueException{
        if (isFull()) {
            throw new QueueException("Cannot insert queue is full");
        }
        data[end++] = item;
        end = end % data.length;
        size++;
        return true;
    }
    public int removed() throws QueueException {
        if (isEmpty()) {
            throw new QueueException("Cannot removed queue is empty");
        }
        int removed = data[front++];
        front = front % data.length;
        size--;
        return removed;
    }
    public void display() throws QueueException {
        if (isEmpty()){
            throw new QueueException("Cannot display queue is empty");
        }
        int i = front;
        do{
            System.out.print(data[i++]+"<- ");
            i %= data.length;
        }while(i != end);
        System.out.print(" END");
    }

    public boolean isFull() {
        return size == data.length; // ptr is at last index
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
