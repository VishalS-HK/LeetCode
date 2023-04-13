class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        
        while(start <= end){
            int mid = start + (end - start) / 2;
            
            if(arr[mid] > arr[mid + 1]){
                /*
                we are in the descending part of the array
                */
                end = mid - 1;
            }
            else{
                /*
                we are in the ascending part of the array 
                */
                start = mid + 1;
            }
        }
        //when start == end, we get the peak element of the array
        return start; // or return end;
        
    }
}