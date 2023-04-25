class Solution {
public:
    int hammingDistance(int x, int y) {
        int HammingDistance = 0;
        for(int k = x ^ y; k != 0; k = k & (k-1))
            HammingDistance++;
        return HammingDistance;
    }
};