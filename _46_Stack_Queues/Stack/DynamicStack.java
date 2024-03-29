package DsaProgress._46_Stack_Queues.Stack;

public class DynamicStack extends CustomStack{
    public DynamicStack(){
        super();
    }
    public DynamicStack(int size){
        super(size);
    }
    // only push get override

    @Override
    public boolean push(int num) throws StackException {
        if(this.isFull()){
            int[] temp = new int[data.length * 2];
            for(int i = 0; i < data.length; i++){
                temp[i] = data[i];
            }
            data = temp;
        }
        // at this point array is not full
        return super.push(num);
    }
}

