import java.util.*;
import java.util.stream.*;
import java.math.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        int answer = 0;
        
        // 1. 내림차순 정렬을 위해 int[] -> Integer로 변경
        List<Integer> scoreList = Arrays.stream(score).boxed().collect(Collectors.toList());
        // 2. 내림차순 정렬
        Collections.sort(scoreList, Collections.reverseOrder());
        
        // 3. 인덱스를 m번째부터 +m단위로 계산
        for(int i = m-1; i<scoreList.size(); i+=m) {
            answer += scoreList.get(i)*m;
        }
        
        return answer;
    }
}