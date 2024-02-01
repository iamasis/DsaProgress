package DsaProgress._30_31_Sorting;

import java.util.Arrays;

public class _01_MergeSort {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
//        int[] ans = mergesort(arr);
        // we can print arr directly because it's not modifying the original one.
//        System.out.println(Arrays.toString(ans));
        mergesortInplace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergesort(int[] arr){
        if(arr.length == 1){
            return arr;
        }

        int mid = arr.length/2;

        int[] left = mergesort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergesort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }
    static int[] merge(int[] first, int[] second){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mix = new int[first.length+ second.length];
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while(i < first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j < second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }

    // Method 2 without creating new copies
    static void mergesortInplace(int[] arr, int s, int e){
        if(e-s ==1 ){
            return;
        }

        int mid = s + (e-s)/2;

        mergesortInplace(arr, 0, mid);
        mergesortInplace(arr, mid, e);

        mergeInplace(arr, s, mid, e);
    }
    static void mergeInplace(int[] arr, int start, int mid, int end){
        int i = start;
        int j = mid;
        int k = 0;
        int[] mix = new int[end-start];
        while(i < mid && j < end){
            if(arr[i] < arr[j]){
                mix[k] = arr[i];
                i++;
            }else{
                mix[k] = arr[j];
                j++;
            }
            k++;
        }

        // it may be possible that one of the arrays is not complete
        // copy the remaining elements
        while(i < mid){
            mix[k] = arr[i];
            i++;
            k++;
        }

        while(j < end){
            mix[k] = arr[j];
            j++;
            k++;
        }
        // Assigning mix[] values to original arrays
        for (int l = 0; l < mix.length; l++) {
            arr[start+l] = mix[l];
        }
    }
}
