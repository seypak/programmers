class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        
        if(section.length == 1) {
            return answer;
        }
        
        int start = section[0];
        for(int i=1; i<section.length; i++) {
            int end = section[i];
            if(start+m > end) {
                continue;
            }
            start = end;
            answer++;
        }
        
        return answer;
    }
}