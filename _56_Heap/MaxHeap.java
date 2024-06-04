package DsaProgress._56_Heap;


import java.util.ArrayList;

// program to make an maxHeap from an unsorted array
public class MaxHeap {
    ArrayList<Integer> list;
    public MaxHeap(){
        list = new ArrayList<>();
    }
    public void insertArray(int[] arr){
        int n = arr.length;
        for(int i = n/2-1; i >= 0; i--){
            downHeap(i, arr);
        }
    }
    private void downHeap(int index, int[] arr){
        int max = index;
        int left = left(index);
        int right = right(index);

        if (left < arr.length && arr[max] < arr[left]) {
            max = left;
        }
        if (right < arr.length && arr[max] < arr[right]) {
            max = right;
        }
        if(max != index){
            swap(index, max, arr);
            downHeap(max, arr);
        }
    }
    private int parent(int index){
        return (index-1)/2;
    }
    private int left(int index){
        return index*2+1;
    }
    private int right(int index){
        return index*2+2;
    }
    private void swap(int f, int s, int[] arr){
        int temp = arr[f];
        arr[f] = arr[s];
        arr[s] = temp;
    }
}
