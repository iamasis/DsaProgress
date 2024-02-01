package DsaProgress._17_to_20_Sorting._01_Basic;
import java.util.Arrays;

public class _03_InserationSort {
    public static void main(String[] args) {
        int[] arr = {-1, 0, 5, 9, 11, 7};
        inseration(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void inseration(int[] arr){
        for(int i = 0; i < arr.length-1; i++){
            for(int j = i+1; j > 0; j--){
                if(arr[j-1] > arr[j]){
                    swap(arr, j-1, j);
                }
                else{
                    break;
                }
            }
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
