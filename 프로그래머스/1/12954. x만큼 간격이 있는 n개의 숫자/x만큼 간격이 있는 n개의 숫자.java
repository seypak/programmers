import java.util.*;

class Solution {
    public long[] solution(int x, int n) {
        long[] result = {};
        List<Long> list = new ArrayList<>();
        long total = 0;
        for(int i=0; i<n; i++) {
            total+=x;
            list.add(total);
        }
        return list.stream().mapToLong(i -> i).toArray();
    }
}