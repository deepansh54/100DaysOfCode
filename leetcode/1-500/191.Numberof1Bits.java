import java.nio.ByteBuffer;
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        
        return BitSet.valueOf(ByteBuffer.allocate(4).putInt(n).array()).cardinality();
    }
}
//https://leetcode.com/problems/number-of-1-bits/
