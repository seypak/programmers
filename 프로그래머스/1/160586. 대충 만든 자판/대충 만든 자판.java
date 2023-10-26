import java.util.*;

class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        int[] answer = {};
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<keymap.length; i++) {
            String keyStr = keymap[i];
            for(int j=0; j<keyStr.length(); j++) {
                String key = String.valueOf(keyStr.charAt(j));
                if(map.get(key) != null) {
                    if((j+1) < map.get(key)) {
                        map.put(key, (j+1));
                    } else {
                        continue;
                    }
                } else {
                    map.put(key, (j+1));
                }
            }
        }
        
        List<Integer> answerList = new ArrayList<Integer>();
        for(int i=0; i<targets.length; i++) {
            boolean flag = true;
            StringBuilder sb = new StringBuilder();
            String targetStr = targets[i];
            int count = 0;
            for(int j=0; j<targetStr.length(); j++) {
                String target = String.valueOf(targetStr.charAt(j));
                if(map.get(target) == null) {
                    flag = false;
                    break;
                } else {
                    count += map.get(target);
                }
            }
            if(flag) {
                answerList.add(count);
            } else {
                answerList.add(-1);
            }
        }
        
        return answerList.stream().mapToInt(i -> i).toArray();
    }
}