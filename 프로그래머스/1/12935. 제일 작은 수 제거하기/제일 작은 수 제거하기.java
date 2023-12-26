import java.util.*;
import java.util.stream.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        if(arr.length <= 1) {
            list.add(-1);
        } else {
            int min = Arrays.stream(arr).min().getAsInt();
            list = Arrays.stream(arr).filter(x -> x != min).boxed().collect(Collectors.toList());
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}