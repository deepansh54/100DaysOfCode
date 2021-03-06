class Solution {
    public boolean checkPowersOfThree(int n) {
        List<Integer> a = new ArrayList<>();
        int p=1;
        while(p<=n){
            a.add(p);
            p*=3;
        }
        //System.out.println("T="+a.size()+" a="+a);
        
        
        return getSum(a,a.size(),n);
    }
    public boolean getSum(List<Integer> a, int n, int target){        
        //System.out.println("target="+target+" n="+n);

        if(target == 0){
            return true;
        }
        if(n==0){
            return false;
        }
        return getSum(a, n-1, target) || getSum(a, n-1, target - a.get(n-1));
    }
}
//https://leetcode.com/problems/check-if-number-is-a-sum-of-powers-of-three/
