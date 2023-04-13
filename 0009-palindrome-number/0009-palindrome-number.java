class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0)
            return false;
        int temp = x;
        int sum = 0;
        int rem;
        
        while(x > 0){
            rem = x % 10;
            sum = rem + sum * 10;
            x /= 10;
        }
        if(temp == sum)
            return true;
        else
            return false;
    }
}