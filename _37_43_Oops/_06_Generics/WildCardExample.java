package DsaProgress._37_43_Oops._06_Generics;
import java.util.Arrays;


/*
what if
                IT ONLY INCLUDES SUBCLASS OF NUMBER ALSO
public void getList(List<? extends Number>){
}


 */



            //               HERE T SHOULD BE NUMBER
public class WildCardExample<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE =  10;
    private int size = 0;
    public WildCardExample(){
        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num){
        if(this.isFull()){
            resize();
        }
        data[size++] = num;
    }
    private void resize() {
        Object[] temp = new Object[data.length * 2];
        // copy the elements
        for (int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull() {
        return size == data.length;
    }
    public T remove(){
        T remove = (T) (data[--size]);
        return remove;
    }
    public T get(int index){
        return (T)(data[index]);
    }
    public int size(){
        return size;
    }
    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return Arrays.toString(data) +
                ", size= " + size;
    }

    public static void main(String[] args) {
        WildCardExample<Float> list = new WildCardExample<>();
        list.add(12.1f);
        list.add(90.1f);
        list.add(11.5f);
        System.out.println(list);
    }
}
