class Solution {
    public int nextGreaterElement(int n) {
        String m = String.valueOf(n);
        char[] c = m.toCharArray();
        int index = -1;
        //find the first digit from right which is greater than the digit on its left
        for(int i=c.length-1; i>0; i--){
            if(c[i-1]<c[i]){
                index = i-1;
                break;
            }
        }
        if(index == -1){
            return -1;
        }
        //find min digit just greater than c[index] after index
        int minIndex = 99;
        for(int i=c.length-1;i>index;i--){
            if(c[i]>c[index] && c[i]<minIndex){
                minIndex = i;
            }
        }
        //swap
        char temp = c[index];
        c[index] = c[minIndex];
        c[minIndex] = temp;

        //sort array after index
        Arrays.sort(c, index+1, c.length);
        
        Long v = Long.parseLong(String.valueOf(c));
        if(v>Integer.MAX_VALUE){
            return -1;
        }
        
        return v.intValue();
    }
}
//https://leetcode.com/problems/next-greater-element-iii/