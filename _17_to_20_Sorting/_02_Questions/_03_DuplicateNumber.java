package DsaProgress._17_to_20_Sorting._02_Questions;

public class _03_DuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {3, 1, 2, 3};
        System.out.println(dpnumber(nums));
    }
    static int dpnumber(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] -1;
            if(nums[i] != i+1){
                if(nums[i] != nums[correct]){
                    swap(nums, i, correct);
                }
                else{
                    return nums[i];
                }
            }
            else{
                i++;
            }

        }
        return -1;
    }
    public static void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
