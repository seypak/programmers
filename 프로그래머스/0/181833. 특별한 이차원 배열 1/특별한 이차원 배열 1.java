class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for(int i=0; i<n; i++) {
            int[] temp = new int[n];
            temp[i] = 1;
            answer[i] = temp;
        }
        return answer;
    }
}