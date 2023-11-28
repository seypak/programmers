import java.util.*;

class Solution {
    public int solution(String s) {
        Map<String, String> map = new HashMap<>();
        map.put("zero", "0");
        map.put("one", "1");
        map.put("two", "2");
        map.put("three", "3");
        map.put("four", "4");
        map.put("five", "5");
        map.put("six", "6");
        map.put("seven", "7");
        map.put("eight", "8");
        map.put("nine", "9");
        
        StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<s.length(); i++) {
            if(map.get(sb.toString()) != null) {
                result.append(map.get(sb.toString()));
                sb.setLength(0);
            }
            
            String str = String.valueOf(s.charAt(i));
            
            if(str.chars().allMatch(Character::isDigit)) {
                
                result.append(str);
                continue;
            }
            sb.append(str);
        }
        if(map.get(sb.toString()) != null) {
                result.append(map.get(sb.toString()));
                sb.setLength(0);
            }
        
        return Integer.valueOf(result.toString());
    }
}