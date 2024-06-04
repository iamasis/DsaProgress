package DsaProgress._28_Recursion_Array;

public class _02_LinearSearch {
    public static void main(String[] args) {
        int[] arr = {-1, 4, 3, 5, 10, 12, 15};
//        System.out.println(ls(arr, 1, 0));
//        System.out.println(lsindex(arr, 12, 0));
        System.out.println(bs(arr, 10, 0, arr.length-1));
    }

    // this is boolean check
    static boolean ls(int[] arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return arr[index] == target || ls(arr, target, index+1);
    }

    // this is will give index
    static int lsindex(int[] arr, int target, int index){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }else {
            return lsindex(arr, target, index+1);
        }
    }
    static int bs(int[] arr, int target, int s, int e){
        int m = s + (e-s)/2;
        if(arr[m] == target){
            return m;
        }
        if(arr[m] > target){
            return bs(arr, target, s, m-1);
        }else{
            return bs(arr, target, m+1, e);
        }
    }

}
