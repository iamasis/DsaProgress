package DsaProgress._37_43_Oops._06_Generics;
import java.util.Arrays;

public class CustomGenricArrayList<T> {

    private Object[] data;
    private static int DEFAULT_SIZE =  10;
    private int size = 0;
    public CustomGenricArrayList(){
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
        CustomGenricArrayList<String> list = new CustomGenricArrayList<>();
        list.add("Ashish");
        list.add("Ashwin");
        list.add("Ash");
        System.out.println(list);
    }
}
