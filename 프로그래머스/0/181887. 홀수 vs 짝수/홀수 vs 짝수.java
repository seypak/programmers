class Solution {
    public int solution(int[] num_list) {
        int odd = 0;
        int even = 0;
        for(int i=0; i<num_list.length; i++) {
            int val = num_list[i];
            if(i%2 == 0) {
                even +=val;
            } else {
                odd += val;
            }
        }
        return even > odd ? even : odd;
    }
}