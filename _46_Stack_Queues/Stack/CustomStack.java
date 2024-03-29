package DsaProgress._46_Stack_Queues.Stack;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    private int ptr = -1;

    public CustomStack(int size) {
        this.data = new int[size];
    }
    public CustomStack(){
        this(DEFAULT_SIZE);
    }

    public boolean push(int num) throws StackException {
        if(isFull()){
            throw new StackException("Cannot insert stack is full");
        }
        data[++ptr] = num;
        return true;
    }
    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot popped stack is empty");
        }
        return data[ptr--];
    }
    public void display() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot popped stack is empty");
        }
        for (int i = 0; i <= ptr; i++) {
            System.out.print(data[i]+" ->");
        }
        System.out.print(" END");
    }
    public boolean isFull(){
        return ptr == data.length-1;
    }
    public boolean isEmpty(){
        return ptr == -1;
    }
}
