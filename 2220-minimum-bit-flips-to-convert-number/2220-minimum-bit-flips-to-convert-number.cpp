class Solution {
public:
    int minBitFlips(int start, int goal) {
        int count = 0;
        for(int k = start ^ goal; k != 0; k = k & (k - 1))
            count++;
        return count;
    }
};