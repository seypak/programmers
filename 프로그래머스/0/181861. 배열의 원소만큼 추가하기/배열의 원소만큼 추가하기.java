import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<arr.length; i++) {
            int val = arr[i];
            for(int j=0; j<val; j++) {
                list.add(val);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}