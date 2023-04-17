class Solution {
    public boolean isPerfectSquare(int num) {
        int start = 1;
        int end = num;

        while(start <= end){
            int mid = start + (end - start) / 2;
            if(num == (long)mid * mid){
                return true;
            }
            else if(num < (long)mid * mid){
                end = mid - 1;
            }
            else{
                start = mid + 1;
            }
        }
        return false;
    }
}