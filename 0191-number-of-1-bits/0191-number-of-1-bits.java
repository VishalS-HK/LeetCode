public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int weight = 0;
        for(int k = 0; k < 32; k++){
            if((n & (1 << k)) != 0){
                weight++;
            }
        }
        return weight;
    }
}