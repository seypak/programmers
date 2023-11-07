class Solution {
    public String solution(int[] food) {
        String answer = "";
        
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<food.length; i++) {
            int foodCount = food[i];
            int mod = foodCount/2; // 소수점은 자동 버림처리
            // 두사람의 음식종류를 나눈값까지 해당 인덱스 i 를 문자열을 추가한다.
            for(int j=0; j<mod; j++) {
                sb.append("" + i);
            }
        }
        answer = sb.toString() + "0" + sb.reverse().toString();
        return answer;
    }
}