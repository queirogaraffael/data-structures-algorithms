package problems_solving.leetcode.two_pointers;

public class RemoveDuplicatesSortedArray {
    class Solution {
        public int removeDuplicates(int[] nums) {

            // nums = [0,0,1,1,1,2,2,3,3,4]

            if(nums.length == 1){
                return nums[0];
            }

            int k = 0;

            for(int i = 1; i < nums.length; i++){
                if(nums[i] != nums[k]){
                    k++;
                    nums[k] = nums[i];
                }
            }

            return k + 1;

        }
    }
}
