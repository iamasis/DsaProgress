package DsaProgress._23_Reursion;

public class _03_BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {-1, 5, 6, 8, 12, 15, 18, 20, 25, 50, 55};
        int target = 1;
        System.out.println(Bs(arr, target, 0, arr.length-1));
    }
    static int Bs(int[] arr, int target, int s, int e){
        int m = s + (e - s)/2;
        if(s > e){
            return -1;
        }
        if(arr[m] == target){
            return m;
        }
        if(arr[m] > target){
            return Bs(arr, target, 0, m-1);
        }
        return Bs(arr, target, m+1, e);
    }
}
