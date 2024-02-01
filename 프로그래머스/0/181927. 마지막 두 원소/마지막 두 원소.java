import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] num_list) {
        List<Integer> list = Arrays.stream(num_list).boxed().collect(Collectors.toList());
        int last = num_list[num_list.length-1];
        int beforelast = num_list[num_list.length-2];
        int addLast = last > beforelast ? last - beforelast : last*2;
        list.add(addLast);
        return list.stream().mapToInt(i -> i).toArray();
    }
}