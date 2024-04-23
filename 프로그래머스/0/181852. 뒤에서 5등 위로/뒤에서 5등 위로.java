import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list) {
        Arrays.sort(num_list);
        
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        for(int i=0; i<5; i++) {
            list.remove(0);
        }
        int[] result = list.stream().mapToInt(i->i).toArray();
        return result;
    }
}