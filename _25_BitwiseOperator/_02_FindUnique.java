package DsaProgress._25_BitwiseOperator;

public class _02_FindUnique {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 5, 6, 7, 6, 7, 9, 8, 9, 8};
        System.out.println(find(arr));
    }
    static int find(int[] arr){
        int unique = 0;
        for(int num : arr){
            unique ^= num;
        }
        return unique;
    }
}
