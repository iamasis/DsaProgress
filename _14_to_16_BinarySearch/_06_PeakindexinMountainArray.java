package DsaProgress._14_to_16_BinarySearch;

public class _06_PeakindexinMountainArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 10, 9, 8, 6};
        System.out.println(peak(arr));
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

}
