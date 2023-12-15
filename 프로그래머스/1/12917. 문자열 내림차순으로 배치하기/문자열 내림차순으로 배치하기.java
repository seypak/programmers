import java.util.*;

class Solution {
    public String solution(String s) {
        String[] sArr = s.split("");
        Arrays.sort(sArr, Collections.reverseOrder());
        
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<sArr.length; i++) {
            sb.append(sArr[i]);
        }
        return sb.toString();
        
    }
}