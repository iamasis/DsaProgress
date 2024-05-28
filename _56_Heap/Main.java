package DsaProgress._56_Heap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws Exception {
//        Heap<Integer> heap = new Heap<>();
//        heap.insert(10);
//        heap.insert(20);
//        heap.insert(11);
//        heap.insert(9);

//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
//        System.out.println(heap.remove());
//        ArrayList<Integer> data = heap.heapSort();
//        System.out.println(data);
        MaxHeap h = new MaxHeap();
        int[] arr = {5, 1, 9, 2, 11, 15, 13};
        h.insertArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
