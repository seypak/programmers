import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<intStrs.length; i++) {
            String str = intStrs[i];
            int intVal = Integer.valueOf(str.substring(s,s+l));
            if(intVal > k) {
                list.add(intVal);
            }
        }
        return list.stream().mapToInt(i->i).toArray();
    }
}