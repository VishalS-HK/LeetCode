class Solution {
    public int missingNumber(int[] nums) {
        int i = 0;
        while(i < nums.length){
            //its not nums[i] - 1, as the given range is 0-n.
            int correctIndex = nums[i];
            if(nums[i] < nums.length && nums[i] != nums[correctIndex])
                swap(nums, i, correctIndex);
            else
                i++;
        }
        for(int j = 0; j < nums.length; j++){
            if(nums[j] != j)
                return j;
        }
        return nums.length;
    }
    
    public void swap(int[] nums, int first, int second){
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}