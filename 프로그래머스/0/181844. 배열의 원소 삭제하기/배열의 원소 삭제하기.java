import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        
        return Arrays.stream(arr).filter(x -> !Arrays.stream(delete_list).anyMatch(y-> x==y)).toArray();
    }
}