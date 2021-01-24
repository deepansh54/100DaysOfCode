class Solution {
    public String maximumTime(String time) {
        StringBuilder r = new StringBuilder();
        if(time.charAt(0)=='?'){
            if(time.charAt(1) ==  '?' || time.charAt(1)<'4'){
                r.append("2");
            }
            else{
                r.append("1");
            }
        }
        else{
            r.append(time.charAt(0));
        }
        if(time.charAt(1)=='?'){
            if(time.charAt(0)<'2'){
                r.append("9");
            }
            else{
                r.append("3");
            }
        }
        else{
            r.append(time.charAt(1));
        }
        r.append(":");
        if(time.charAt(3)=='?'){
            r.append("5");
        }
        else{
            r.append(time.charAt(3));
        }
        if(time.charAt(4)=='?'){
            r.append("9");
        }
        else{
            r.append(time.charAt(4));
        }
        return r.toString();
    }
}
//https://leetcode.com/problems/latest-time-by-replacing-hidden-digits/
