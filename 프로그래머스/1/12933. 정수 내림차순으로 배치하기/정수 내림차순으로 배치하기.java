import java.util.*;

class Solution {
    public long solution(long n) {
        
        String nStr = String.valueOf(n);
        char[] nChar = nStr.toCharArray();
        Arrays.sort(nChar);
        String str = new String(nChar);
        StringBuilder sb = new StringBuilder(str);
        return Long.valueOf(sb.reverse().toString());
    }
}