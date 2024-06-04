package DsaProgress._14_to_16_BinarySearch;

public class _07_SearchinMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 10, 9, 8, 6, 3};
        int target = 3;
        System.out.println(Search(arr, target));
    }
    static int Search(int[] arr, int target){
        int peak = peak(arr);
        if(target == peak){
            return peak;
        }
        int firsttry = ArgonosticSearch(arr, target,0,peak);
        if(firsttry != -1){
            return firsttry;
        }
        return ArgonosticSearch(arr, target, peak+1, arr.length-1);
    }
    static int peak(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while(start < end){
            int mid = start +(end -start)/2;
            if(arr[mid] > arr[mid+1]){
                end = mid;
            }
            else{
                start = mid+1;
            }
        }
        return start;
    }
    static int ArgonosticSearch(int[] arr, int target, int start, int end){
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
