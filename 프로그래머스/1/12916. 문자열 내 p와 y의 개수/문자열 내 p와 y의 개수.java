import java.util.*;

class Solution {
    boolean solution(String s) {
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<s.length(); i++) {
            String str = String.valueOf(s.charAt(i)).toLowerCase();
            map.put(str, map.getOrDefault(str, 0)+1);
        }
        
        if(map.get("p") == null && map.get("y") == null) {
            return true;
        }
        if(map.get("p") == map.get("y")) {
            return true;
        }

        return false;
    }
}