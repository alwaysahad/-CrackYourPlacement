class Solution {
    public void moveZeroes(int[] nums) {
        int j = -1;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) return; // No zeros found, nothing to do

        for(int i = j + 1; i < nums.length; i++) {
            if(nums[i] != 0) {
                swap(nums, i, j);
                j++;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
