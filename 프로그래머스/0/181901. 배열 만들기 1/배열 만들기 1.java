import java.util.*;

class Solution {
    public int[] solution(int n, int k) {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=n; i++) {
            if(i*k > n) {
                break;
            }
            list.add(k*i);
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}