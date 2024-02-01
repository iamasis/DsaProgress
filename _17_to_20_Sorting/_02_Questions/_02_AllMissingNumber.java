package DsaProgress._17_to_20_Sorting._02_Questions;

import java.util.ArrayList;
import java.util.List;

// IT STARTS WITH (1, N)


public class _02_AllMissingNumber {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(Miss(nums));
    }
    public static List<Integer> Miss(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correctindex = nums[i]-1;
            if(nums[i] != nums[correctindex]){
                swap(nums, i, correctindex);
            }else{
                i++;
            }
        }
        List<Integer> list = new ArrayList<>(nums.length);
        for(int index = 0; index < nums.length; index++){
            if(nums[index] != (index+1)){
                list.add(index+1);
            }
        }
        return list;
    }
    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
