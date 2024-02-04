class Solution {
    public int solution(int n, String control) {
        int answer = n;
        
        for(int i=0; i<control.length(); i++) {
            String str = String.valueOf(control.charAt(i));
            if("w".equals(str)) {
                answer+=1;
            } else if ("s".equals(str)) {
                answer-=1;
            } else if ("d".equals(str)) { 
                answer+=10;
            } else {
                answer-=10;
            }
        }
        
        return answer;
    }
}