class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        
        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);
        
        if(Integer.valueOf(aStr+bStr) >= Integer.valueOf(bStr+aStr)) {
            answer = Integer.valueOf(aStr+bStr);
        } else {
            answer = Integer.valueOf(bStr+aStr);
        }
        return answer;
    }
}