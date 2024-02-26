class Solution {
    public int solution(int[] arr, int idx) {
        for(int i=0; i<arr.length; i++) {
            int val = arr[i];
            if(val == 0) {
                continue;
            }
            if(i >= idx) {
                return i;
            }
        }
        return -1;
    }
}