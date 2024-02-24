class Solution {
    public int[] solution(int start, int end_num) {
        int[] result = new int[start-end_num+1];
        int index = 0;
        for(int i=start; i>=end_num; i--) {
            result[index] = i;
            index++;
        }
        return result;
    }
}