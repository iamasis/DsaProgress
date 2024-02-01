package DsaProgress._14_to_16_BinarySearch;

import java.util.Arrays;

public class _04_FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {5, 7, 7, 8, 8,10};
        int target = 8;
        System.out.println(Arrays.toString(Search(nums, target)));
    }
    static int[] Search(int[] nums, int target){
        int[] ans = {-1, -1};
        ans[0] = binary(nums, target, true);
        if(ans[0] != -1){
            ans[1] = binary(nums, target, false);
        }
        return ans;
    }
    static int binary(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while(start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential ans found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}
