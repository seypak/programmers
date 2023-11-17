import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int leftMax = 0;
        int rightMax = 0;
        for(int i=0; i<sizes.length; i++) {
            int[] size = sizes[i];
            if(size[0] < size[1]) {
                int temp = size[1];
                size[1] = size[0];
                size[0] = temp;
            }
            
            leftMax = Math.max(leftMax, size[0]);
            rightMax = Math.max(rightMax, size[1]);
        }
        
        return leftMax * rightMax;
    }
}