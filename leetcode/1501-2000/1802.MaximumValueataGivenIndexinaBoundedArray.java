class Solution {
    public int maxValue(int n, int index, int maxSum) {
        int maxVal = 1;
        long val = 1;
        long l = -1;
        long r = -1;
        long lmax = index;
        long rmax = n-index-1;
        long sum = n;
        long msum = (lmax*(lmax+1))/2 + (rmax*(rmax+1))/2 + (lmax>rmax ? lmax+1:rmax+1) + Math.abs(rmax-lmax) * (lmax<rmax ? lmax:rmax);
        if(msum<=maxSum){
            if(msum == maxSum){
                return (int)(lmax>rmax ? lmax+1:rmax+1);
            }
            sum = maxSum-msum;
            long rem = (sum / n);
            return (int)(lmax>rmax ? lmax+1+rem:rmax+1+rem);
        }
        while(sum<maxSum){
            maxVal++;
            if(l<lmax){
                l++;
            }
            else{
                l=lmax;
            }
            if(r<rmax){
                r++;
            }
            else{
                r=rmax;
            }
            //System.out.println("l="+l+" r="+r+" v="+maxVal);
            sum+= (l+r+val);
            
        }
        if(sum>maxSum){
            maxVal--;
        }
        return maxVal;
    }
}

//TestCases
// 4
// 2
// 6
// 6
// 1
// 10
// 3
// 2
// 18
// 7
// 5
// 30
// 8257285
// 4828516
// 850015631
// 1
// 0
// 780055968
//https://leetcode.com/problems/maximum-value-at-a-given-index-in-a-bounded-array/