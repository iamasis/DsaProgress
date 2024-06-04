package DsaProgress._14_to_16_BinarySearch;

import java.util.Arrays;

public class _11_2DBinarySearch {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 3, 5, 7, 10},
                {13, 11, 19, 20, 24, 25},
                {26, 29, 30, 35},
                {40, 41, 42},
                {49, 50, 51, 52, 99, 100, 101}
        };
        int target = 101;
        System.out.println(Arrays.toString(search(arr, target)));
    }
    static int[] search(int[][] arr, int target){
        int rows = arr.length;
        int col = 2;
        int rstart = 0;
        int rend = rows-1;
        while(rstart < (rend-1)){
            int rmid = rstart + (rend-rstart)/2;
            if(arr[rmid][col] == target){
                return new int[] {rmid, col};
            }
            if(arr[rmid][col] < target){
                rstart = rmid;
            }
            else {
                rend = rmid;
            }
        }
        if(arr[rstart][col] == target){
            return new int[] {rstart, col};
        }
        if(arr[rstart+1][col] == target){
            return new int[] {rstart+1, col};
        }
        if(arr[rstart][col] > target){
            return binarysearch(arr, target, rstart, 0, col-1);
        }
        if(arr[rstart][col] < target && arr[rstart][arr[rstart].length-1] >= target ){
            return binarysearch(arr, target, rstart, col+1, arr[rstart].length-1);
        }
        if(arr[rstart+1][col] > target){
            return binarysearch(arr, target, rstart+1, 0, col-1);
        }
        else{
            return binarysearch(arr, target, rstart+1, col+1, arr[rstart+1].length-1);
        }
    }
    static int[] binarysearch(int[][] arr, int target, int row, int cstart, int cend){
        while(cstart <= cend){
            int cmid = cstart + (cend - cstart)/2;
            if(arr[row][cmid] == target){
                return new int[] {row, cmid};
            }
            if(arr[row][cmid] < target){
                cstart = cmid+1;
            }
            else{
                cend = cmid-1;
            }
        }
        return new int[] {-1, -1};
    }
}
