package DsaProgress._14_to_16_BinarySearch;

public class _01_ArgonosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {20, 10, 5, 4, 3, 2, 0, -6, -10};
        int target = -10;
        System.out.println(ArgonosticSearch(arr, target));
    }
    static int ArgonosticSearch(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = arr[start] < arr[end];
        while(start <= end){
            int mid = start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(arr[mid] > target){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
            else{
                if(arr[mid] > target){
                    start = mid +1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
