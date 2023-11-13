import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        
        String hamburger = "1231";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<ingredient.length; i++) {
            sb.append(ingredient[i]);
            if(sb.length() >= 4 && sb.subSequence(sb.length()-4, sb.length()).equals(hamburger)) {
                sb.delete(sb.length()-4, sb.length());
                answer++;
            }
        }
        return answer;
    }
}