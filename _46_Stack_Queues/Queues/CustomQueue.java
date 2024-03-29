package DsaProgress._46_Stack_Queues.Queues;

public class CustomQueue {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int end = 0;
    public CustomQueue() {
        this(DEFAULT_SIZE);
    }
    public CustomQueue(int size){
        this.data = new int[size];
    }

    public boolean insert(int num) throws QueueException{
        if(isFull()){
            throw new QueueException("Cannot insert queue is full");
        }
        data[end++] = num;
        return true;
    }
    public int remove() throws QueueException{
        if(isEmpty()){
            throw new QueueException("Cannot removed queue is empty");
        }
        int removed = data[0];
        for(int i = 1; i < end; i++){
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }
    public void display() throws QueueException{
        if(isEmpty()){
            throw new QueueException("Cannot display queue is empty");
        }
        for(int i = 0; i < end; i++){
            System.out.print(data[i]+"<- ");
        }
        System.out.print("End");
    }
    public boolean isFull() {
        return end == data.length; // ptr is at last index
    }
    public boolean isEmpty() {
        return end == 0;
    }
}
