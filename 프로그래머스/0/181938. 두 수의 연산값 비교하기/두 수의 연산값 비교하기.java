class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);
        
        int ab = Integer.valueOf(aStr+bStr);
        int multiplyab = 2*a*b;
        if(ab > multiplyab) {
            answer = ab;
        } else {
            answer = multiplyab;
        }
        return answer;
    }
}