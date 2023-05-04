class Solution {
    public int[] getConcatenation(int[] nums) {
        int len = nums.length;
        int[] finAns = new int[len * 2];
        
        for(int i = 0; i < len; i++){
            finAns[i]= nums[i];
            finAns[i + len] = nums[i];
        }
        return finAns;
    }
}