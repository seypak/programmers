class Solution {
    public int solution(String number) {
        int answer = 0;
        int total = 0;
        for(int i=0; i<number.length(); i++) {
            total += Integer.valueOf(String.valueOf(number.charAt(i)));
        }
        answer = total%9;
        return answer;
    }
}