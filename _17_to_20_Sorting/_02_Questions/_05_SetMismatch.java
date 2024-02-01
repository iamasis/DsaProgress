package DsaProgress._17_to_20_Sorting._02_Questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _05_SetMismatch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 4};
        System.out.println(Arrays.toString(setmis(nums)));
    }
    public static int[] setmis(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i]-1;
            if(nums[i] != nums[correct]){
                swap(nums, i, correct);
            }
            else{
                i++;
            }
        }

        for (int index = 0; index < nums.length; index++) {
            if (nums[index] != index + 1) {
                return new int[] {nums[index], index+1};
            }
        }
        return new int[] {-1, -1};
    }
    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
