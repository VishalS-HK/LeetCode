class Solution {
    public int fib(int n) {
        if(n < 2)
            return n;
        int a = 1;
        int b = 1;
        for(int k = 2; k < n; k++){
            int temp = a;
            a += b;
            b = temp;
        }
        return a;
    }
}