package DsaProgress._46_Stack_Queues.Queues;

public class DynamicCircularQueue extends CircularQueue{
    public DynamicCircularQueue(int size){
        super(size);
    }
    public DynamicCircularQueue(){
        super();
    }

    @Override
    public boolean insert(int item) throws QueueException {
        if(this.isFull()){
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front+i) % data.length];
            }
            data = temp;
            front = 0;
            end = data.length;
        }
        return super.insert(item);
    }
}
