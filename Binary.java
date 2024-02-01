package DsaProgress;

public class Binary {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 9, 11, 15, 18, 20};
        System.out.println(Search(arr, 11, 0, arr.length-1));
    }
    static int Search(int[] arr, int target, int s, int e){
        if(s > e){
            return -1;
        }
        int m = s + (e -s)/2;
        if(target == arr[m]){
            return m;
        }
        if(target > arr[m]){
            return Search(arr, target, m+1, e);
        }else{
            return Search(arr, target, s, m-1);
        }
    }
}
