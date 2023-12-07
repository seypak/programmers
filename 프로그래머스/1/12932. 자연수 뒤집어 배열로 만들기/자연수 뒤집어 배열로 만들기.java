import java.util.*;

class Solution {
    
    public int[] solution(long n) {
        
        StringBuilder sb = new StringBuilder(String.valueOf(n));
        String str = sb.reverse().toString();
        char[] charArray = str.toCharArray();
        
        int[] answer = new int[charArray.length];
        for(int i=0; i<charArray.length; i++) {
            answer[i] = Integer.valueOf(String.valueOf(charArray[i]));
        }
        
        return answer;
    }
}