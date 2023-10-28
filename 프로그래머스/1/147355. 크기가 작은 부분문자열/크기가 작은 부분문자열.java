import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        
        int pLen = p.length();
        Long pVal = Long.valueOf(p);
        
        for(int i=0; i<t.length()-(pLen-1); i++) {
            Long val = Long.valueOf(t.substring(i, (pLen)+i));
            if(val <= pVal) {
                answer++;
            }
        }
        
        return answer;
    }
}