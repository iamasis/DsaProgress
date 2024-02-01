package DsaProgress._25_BitwiseOperator;

import java.util.Arrays;

public class _13_FlipandInvert2darray {
    public static void main(String[] args) {
        int[][] arr = { {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };
        flipandinnverse(arr);
        for(int i = 0; i < arr.length; i++){
            System.out.println(Arrays.toString(arr[i]));
        }
    }
    static void flipandinnverse(int[][] arr){
        for(int[] row : arr){
            for(int i = 0; i < (arr[0].length+1)/2; i++){
                int temp = row[i] ^ 1;
                row[i] = row[arr[0].length-i-1] ^1;
                row[arr[0].length-i-1] = temp;
            }
        }
    }

}
