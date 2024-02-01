package DsaProgress._28_Recursion_Array;

public class _03_RBS {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
        System.out.println(rbssearch(arr, 6, 0, arr.length - 1));
    }
    static int rbssearch(int[] arr, int target, int s, int e){
        int m = s + (e-s)/2;
        if(s > e){
            return -1;
        }
        if(arr[m] == target){
            return m;
        }
        if(arr[m] >= arr[s]){
            if (target >= arr[s] && target <= arr[m]) {
                return rbssearch(arr, target, s, m-1);
            } else {
                return rbssearch(arr, target, m+1, e);
            }
        }if (target >= arr[m] && target <= arr[e]) {
            return rbssearch(arr, target, m+1, e);
        }
        return rbssearch(arr, target, s, m-1);
    }
}
