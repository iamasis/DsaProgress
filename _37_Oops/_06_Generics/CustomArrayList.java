package DsaProgress._37_Oops._06_Generics;
import java.util.ArrayList;
import java.util.Arrays;
public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE =  10;
    private int size = 0;
    public CustomArrayList(){
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(this.isFull()){
            resize();
        }
        data[size++] = num;
    }
    private void resize() {
        int[] temp = new int[data.length * 2];
        // copy the elements
        for (int i = 0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
    }
    private boolean isFull() {
        return size == data.length;
    }
    public int remove(){
        int remove = data[--size];
        return remove;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return size;
    }
    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return Arrays.toString(data) +
                ", size= " + size;
    }

    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
//        list.add(4);
//        list.add(14);
//        list.add(42);
//        list.add(41);
//        System.out.println(list);

    }
}
