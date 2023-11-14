import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        List<String> standard = Arrays.asList("aya", "ye", "woo", "ma");
        for(int i=0; i<babbling.length; i++) {
            
            String str = babbling[i];
            // 1. 같을때는 카운트하고 바로 for문종료.
            if(standard.contains(str)) {
                answer++;
                continue;
            }
            
            // 2. 같은 구간이 반복된 곳을 처리
            str = str.replaceAll("ayaaya|yeye|woowoo|mama", "x");
            // 3. 같은 문자열 처리
            str = str.replaceAll("aya|ye|woo|ma", "");
            if ("".equals(str)) {
                answer++;
            }
       }
        return answer;
    }
}