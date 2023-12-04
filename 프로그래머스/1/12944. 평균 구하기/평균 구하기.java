import java.util.*;

class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = Arrays.stream(arr).sum();
        answer = sum/arr.length;
        return answer;
    }
}