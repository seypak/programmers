import java.util.*;

class Solution {
    public String solution(String X, String Y) {
        Map<String, Integer> mapX = new HashMap<String, Integer>();
        for(int i=0; i<X.length(); i++) {
            mapX.put(String.valueOf(X.charAt(i)), mapX.getOrDefault(String.valueOf(X.charAt(i)), 0) + 1);
        }
        
        Map<String, Integer> mapY = new HashMap<String, Integer>();
        for(int i=0; i<Y.length(); i++) {
            mapY.put(String.valueOf(Y.charAt(i)), mapY.getOrDefault(String.valueOf(Y.charAt(i)), 0) + 1);
        }
        
        List<Integer> list = new ArrayList<>();
        for(String key : mapX.keySet()) {
            Integer valueX = mapX.get(key);
            
            if(mapY.get(key) != null) {
                Integer valueY = mapY.get(key);
                while(valueX != 0 && valueY != 0) {
                    list.add(Integer.valueOf(key));
                    valueX--;
                    valueY--;
                }
            }
        }
        
        if(list.size() == 0) {
            return "-1";
        }
        
        Collections.sort(list, Collections.reverseOrder());
        
        if(list.get(0) == 0) {
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<list.size(); i++) {
            sb.append(list.get(i));
        }
        
        return sb.toString();
    }
}