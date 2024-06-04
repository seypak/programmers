import java.util.*;
class Solution {
    public int[] solution(int[] arr, int k) {
        return Arrays.stream(arr).map(x -> {
            if(k%2==0) {
                return x += k;
            } else {
                return x *= k;
            }
        }).toArray();
    }
}