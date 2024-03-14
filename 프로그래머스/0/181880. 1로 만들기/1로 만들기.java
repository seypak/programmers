class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        
        for(int i=0; i<num_list.length; i++) {
            int val = num_list[i];
            int count = 0;
            while(val != 1) {
                if(val%2 ==0) {
                    val /= 2;
                } else {
                    val-=1;
                    val/=2;
                }
                count++;
            }
            answer+=count;
        }
        return answer;
    }
}