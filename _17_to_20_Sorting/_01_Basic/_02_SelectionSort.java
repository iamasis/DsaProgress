package DsaProgress._17_to_20_Sorting._01_Basic;

import java.util.Arrays;

public class _02_SelectionSort {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 5, 9, 11, 7};
        Selection(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Selection(int[] arr){
        for(int i = 0; i < arr.length; i++){
            int last = arr.length-i-1;
            int maxvalueindex = max(arr, 0, last);
            swap(arr, maxvalueindex, last);
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int max(int[] arr, int start, int end){
        int max = start;
        for(int i = start; i <= end; i++){
            if(arr[i] > arr[max]){
                max = i;
            }
        }
        return max;
    }
}
