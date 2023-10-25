import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        // 1. name 별 yearning 점수를 key - value값으로 담는다.
        Map<String, Integer> map = new HashMap<String, Integer>();
        for(int i=0; i<name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        // 2. photo배열을 for문으로 돌려 나오는 키값에 따라 배열에 합한값을 넣는다.
        for(int i=0; i<photo.length; i++) {
            int answerCount = 0;
            String[] names = photo[i];
            for(int j=0; j<names.length; j++) {
                int yearn = map.getOrDefault(names[j], 0);
                answerCount += yearn;
            }
            answer[i] = answerCount;
        }
        
        return answer;
    }
}