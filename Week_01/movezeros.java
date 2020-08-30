class Solution {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        if (len == 0) return;
        for (int i = 0; i < len; ++i) {
            if(nums[i]==0)
            {
                for (int j = i+1; j <len ; ++j) {
                    if(nums[j]!=0) {
                        nums[i] = nums[j];
                        nums[j] = 0;
                        break;
                    }
                }
            }
        }
    }
}