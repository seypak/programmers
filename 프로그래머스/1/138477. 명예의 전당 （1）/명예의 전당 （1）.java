import java.util.*;
import java.math.*;

class Solution {
    public int[] solution(int k, int[] score) {
        List<Integer> temp = new ArrayList<>();
        List<Integer> answerList = new ArrayList<>();
        int min = score[0];
        for(int i=0; i<score.length; i++) {
            int s = score[i];
            if(temp.size() < k) {
                temp.add(s);
            } else {
                
                if(min < s) {
                    temp.remove(0);
                    temp.add(s);
                }
            }
            Collections.sort(temp);
            min = Collections.min(temp);
            answerList.add(min);
            
        }
        return answerList.stream().mapToInt(i -> i).toArray();
    }
}