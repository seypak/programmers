class Solution {
    public int[] solution(int[] arr) {
        for(int i=0; i<arr.length; i++) {
            int val = arr[i];
            if(val >= 50 && (val%2==0)) {
                arr[i] /= 2;
            } else if(val < 50 && (val%2!=0)) {
                arr[i] *= 2;
            }
        }
        return arr;
    }
}