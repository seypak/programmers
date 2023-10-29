import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = {};
        List<Integer> answerList = new ArrayList<Integer>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<s.length(); i++) {
            String str = String.valueOf(s.charAt(i));
            Integer index = map.getOrDefault(str, -1);
            if(index == -1) {
                map.put(str, i);
                answerList.add(-1);
            } else {
                map.put(str, i);
                answerList.add(i-index);
            }
        }
        return answerList.stream().mapToInt(i -> i).toArray();
    }
}