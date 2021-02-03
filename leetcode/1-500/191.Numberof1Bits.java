import java.nio.ByteBuffer;
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight_slow(int n) {
        
        return BitSet.valueOf(ByteBuffer.allocate(4).putInt(n).array()).cardinality();
    }
    //Better Solution ->
    int m1 = 0x55555555;
    int m2 = 0x33333333;
    int m4 = 0x0f0f0f0f;
    int h01= 0x01010101;
    public int hammingWeight(int x) {
        //System.out.println(x);
        x -= (x >> 1) & m1;             
        x = (x & m2) + ((x >> 2) & m2); 
        x = (x + (x >> 4)) & m4;        
        return (x * h01) >> 24;
    }
}
//https://leetcode.com/problems/number-of-1-bits/
