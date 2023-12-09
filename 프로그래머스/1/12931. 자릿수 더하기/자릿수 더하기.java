import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String nStr = String.valueOf(n);
        
        for(int i=0; i<nStr.length(); i++) {
            answer += Integer.valueOf(String.valueOf(nStr.charAt(i)));
        }

        return answer;
    }
}