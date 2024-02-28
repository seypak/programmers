import java.util.*;

class Solution {
    public int[] solution(int[] num_list, int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<num_list.length; i++) {
            int val = num_list[i];
            if(i+1 < n) {
                continue;    
            }
            list.add(val);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}