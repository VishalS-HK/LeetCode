class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> temp = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(temp.contains(nums[i])){
                return true;
            }
            temp.add(nums[i]);
        }
        return false;
    }
}