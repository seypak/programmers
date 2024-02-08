class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for(int i=0; i<queries.length; i++) {
            int index_i = queries[i][0];
            int index_j = queries[i][1];
            
            int temp_i = arr[index_i];
            int temp_j = arr[index_j];
            arr[index_i] = temp_j;
            arr[index_j] = temp_i;
        }
        return arr;
    }
}