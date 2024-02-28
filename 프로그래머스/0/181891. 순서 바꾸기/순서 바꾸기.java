import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=n; i<num_list.length; i++) {
            int val = num_list[i];
            list.add(val);
        }
        
        for(int i=0; i<n; i++) {
            int val = num_list[i];
            list.add(val);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}