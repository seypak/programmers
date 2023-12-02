class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String xStr = String.valueOf(x);
        int result = 0;
        for(int i=0; i<xStr.length(); i++) {
            String temp = String.valueOf(xStr.charAt(i));
            result += Integer.valueOf(temp);
        }
        answer = (x%result == 0) ? true : false;
        return answer;
    }
}