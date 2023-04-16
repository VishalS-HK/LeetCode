//Recursive Solution

class Solution {
    public int[] sortArray(int[] nums) {
        int mid = nums.length / 2;
        
        if(nums.length == 1)
            return nums;
        
        int[] left = sortArray(Arrays.copyOfRange(nums, 0, mid));
        int[] right = sortArray(Arrays.copyOfRange(nums, mid, nums.length));
        
        return merge(left, right);
    }
    
    public int[] merge(int[] first, int[] second){
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mix = new int[first.length + second.length];
        
        while(i < first.length && j < second.length){
            if(first[i] < second[j]){
                mix[k] = first[i++];
            }
            else{
                mix[k] = second[j++];
            }
            k++;
        }
        while(i < first.length){
            mix[k++] = first[i++];
            // i++;
            // k++;
        }
        while(j < second.length){
            mix[k++] = second[j++];
        }
        return mix;
    }
}