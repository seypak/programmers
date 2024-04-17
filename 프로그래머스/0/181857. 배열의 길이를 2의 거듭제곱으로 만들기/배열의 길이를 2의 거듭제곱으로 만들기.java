import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        int len = arr.length;
        
        int len2 = 1;
        while(len2 < len) {
            len2 *= 2;
        }
        if(len == len2) {
            return arr;
        }
        List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
        for(int i=len; i<len2; i++) {
            list.add(0);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}