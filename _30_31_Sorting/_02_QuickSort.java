package DsaProgress._30_31_Sorting;

import java.util.Arrays;

public class _02_QuickSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1, 4, 5};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }

        int s = low;
        int e = high;
        int mid = s + (e- s)/2;
        int pivot = arr[mid];

        while(s <= e){
            while(arr[s] < pivot){
                s++;
            }
            while(arr[e] > pivot){
                e--;
            }
            if(s <= e){
                int temp = arr[s];
                arr[s] = arr[e];
                arr[e] = temp;
                s++;
                e--;
            }
            // now pivot is at right index sort two halves of arrays
            sort(arr, low, e);
            sort(arr, s, high);
        }
    }
}
