package DsaProgress._14_to_16_BinarySearch;

public class _02_Celling_Floor {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 8, 10, 12, 15};
        int target = 7;
        System.out.println(Celling(arr, target));
        System.out.println(Floor(arr, target));
    }
    static int Celling(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
    static int Floor(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        while(start <= end){
            int mid = start + (end - start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[mid] > target){
                end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return end;
    }
}
