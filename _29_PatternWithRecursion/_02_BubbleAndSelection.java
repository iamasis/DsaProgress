package DsaProgress._29_PatternWithRecursion;

import java.util.Arrays;

public class _02_BubbleAndSelection {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};

//        bubble(arr, arr.length-1, 0);
        // here we use arr.length-1 because we want to check c+1
//        System.out.println(Arrays.toString(arr));
        selection(arr, arr.length, 0, 0);
        System.out.println(Arrays.toString(arr));
    }
    static void selection(int[] arr, int r, int c, int max ){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[max]){
                selection(arr, r, c+1, c);
            }else{
                selection(arr, r, c+1, max);
            }
        }else{
            int temp = arr[max];
            arr[max] = arr[r-1];
            arr[r-1] = temp;
            selection(arr, r-1, 0, 0);
        }
    }

    static void bubble(int[] arr, int r, int c){
        if(r == 0){
            return;
        }
        if(c < r){
            if(arr[c] > arr[c+1]){
                int temp = arr[c];
                arr[c] = arr[c+1];
                arr[c+1] = temp;
            }
            bubble(arr, r, c+1);
        }else{
            bubble(arr, r-1, 0);
        }
    }

}
