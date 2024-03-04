import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        
        int i = 0;
        while(i<num_list.length) {
            list.add(num_list[i]);
            i+=n;
        }
        return list.stream().mapToInt(k -> k).toArray();
    }
}