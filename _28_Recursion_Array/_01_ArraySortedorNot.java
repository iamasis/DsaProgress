package DsaProgress._28_Recursion_Array;

public class _01_ArraySortedorNot {
    public static void main(String[] args) {
        int[] arr = {-1, 4, 3, 5, 10, 12, 15};
        System.out.println(sort(arr, 0));
    }
    static boolean sort(int[] arr, int index){
        if(index == arr.length-1){
            return true;
        }
        return arr[index] < arr[index+1] && sort(arr, index+1);
    }
}
