class Solution {
    public int maximumGain(String s, int x, int y) {
        // int maxGain = getGain(s, x, y, 'a', 'b', 0, s.length());
        // int maxGain2 = getGain(s, y, x, 'b', 'a', 0, s.length());
        int maxGain = 0;
        int maxGain2 = 0;
        int a=0,b=0,start=-1;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                a++;
                if(start==-1)start = i;
            }
            else if(s.charAt(i)=='b'){
                b++;
                if(start==-1)start = i;
            }
            else if(a>0 && b>0){
                a=0;b=0;
                //System.out.println("start "+start+" end "+(i+1));
                maxGain += getGain(s, x, y, 'a', 'b', start,i+1);
                maxGain2 += getGain(s, y, x, 'b', 'a', start, i+1);
                start=-1;
            }
            else{
                a=0;b=0;
                start=-1;
            }
            //System.out.println(s.charAt(i) + " a "+a+" b "+b+" start "+start);
        }
        if(a>0 && b>0){
            a=0;b=0;
            //System.out.println("start "+start+" end "+(s.length()));
            maxGain += getGain(s, x, y, 'a', 'b', start, s.length());
            maxGain2 += getGain(s, y, x, 'b', 'a', start, s.length());
            start=-1;
        }
        
        return maxGain>maxGain2?maxGain:maxGain2;
    }
    private Integer getGain(String s, int x, int y, char first, char sec, int start, int end){
        //System.out.println(String.format("x=%s y=%s %s%s",x, y,first,sec));
        int maxGain = 0;
        ArrayDeque<Character> a1 = new ArrayDeque<>();
        for(int i=start,j=-1;i<end;i++){
            char f = s.charAt(i);
            if(a1.peekLast()!= null && f == sec && a1.peekLast() == first){
                maxGain+=x;
                a1.pollLast();
            }
            else {
                a1.offerLast(f);                
            }
        }
        //System.out.println(a1);
        ArrayDeque<Character> a2 = new ArrayDeque<>();
        while(!a1.isEmpty()){
            char f = a1.pollFirst();
            if(a2.peekLast()!=null && f == first && a2.peekLast() == sec){
                maxGain+=y;
                a2.pollLast();
            }
            else{
                a2.offerLast(f);
            }
        }
        //System.out.println(a2);

        return maxGain;
    }
}
//https://leetcode.com/problems/maximum-score-from-removing-substrings/