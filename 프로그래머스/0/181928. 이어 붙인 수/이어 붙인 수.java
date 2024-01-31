class Solution {
    public int solution(int[] num_list) {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(int i=0; i<num_list.length;i ++) {
            if(num_list[i] % 2 == 0) {
                sb.append(num_list[i]);
            } else {
                sb2.append(num_list[i]);
            }
        }
        return Integer.valueOf(sb.toString()) + Integer.valueOf(sb2.toString());
    }
}