package DsaProgress._14_to_16_BinarySearch;

public class _05_InfiniteArray {
    public static void main(String[] args) {
        int[] arr = {1, 5, 6, 7, 12, 13, 15, 19, 20, 25, 28, 30};
        int target = 12;
        System.out.println(Search(arr, target));
    }
    static int Search(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(arr[end] < target){
            int newstart = end+1;
            //new end is (end +(size of box)*2)
            end = end + (end-start+1)*2;
            start = newstart;
        }
        return Binary(arr, target, start, end);
    }
    static int Binary(int[] arr, int target, int start, int end) {
        while(start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }
}
