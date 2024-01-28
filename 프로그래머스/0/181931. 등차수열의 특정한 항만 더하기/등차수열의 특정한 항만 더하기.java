class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int temp = a;
        for(int i=0; i<included.length; i++) {
            if(i != 0) temp += d;
            if(included[i]) {
                answer+= temp;
            }
        }
        return answer;
    }
}