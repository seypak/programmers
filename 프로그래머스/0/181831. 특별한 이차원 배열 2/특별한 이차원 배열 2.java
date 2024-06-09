import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[][] arr) {
        for(int i=0; i<arr.length; i++) {
            int[] x = arr[i];
            for(int j=0; j<x.length; j++) {
                if(arr[i][j] != arr[j][i]) {
                    return 0;
                }
            }
        }
        return 1;
    }
}