import java.util.*;

class Solution {
    public int solution(int n) {
        String three = Integer.toString(n,3);
        StringBuilder sb = new StringBuilder(three);
        
        String reverseStr = sb.reverse().toString();
        
        return Integer.parseInt(reverseStr, 3);
    }
}