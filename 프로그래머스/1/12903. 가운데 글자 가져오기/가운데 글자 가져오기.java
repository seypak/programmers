class Solution {
    public String solution(String s) {
        String answer = "";
        int len = s.length();
        int idx = len/2;
        if(len % 2 == 0) {
            answer+= String.valueOf(s.charAt(idx-1));
            answer+= String.valueOf(s.charAt(idx));
        } else {
            answer+= String.valueOf(s.charAt(idx));
        }
        return answer;
    }
}