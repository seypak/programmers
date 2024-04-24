import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<strArr.length; i++) {
            String str = strArr[i];
            map.put(str.length(), map.getOrDefault(str.length(), 0)+1);
        }
        List<Map.Entry<Integer, Integer>> entryList = new ArrayList<>(map.entrySet());
        entryList.sort(Map.Entry.comparingByValue());
        return entryList.get(entryList.size()-1).getValue();
    }
}