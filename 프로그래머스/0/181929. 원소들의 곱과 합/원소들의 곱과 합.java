class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        int multiplyTotal = 1;
        int sumTotal = 0;
        for(int i=0; i<num_list.length; i++) {
            multiplyTotal *= num_list[i];
            sumTotal += num_list[i];
        }
        return multiplyTotal < (sumTotal*sumTotal) ? 1 : 0;
    }
}