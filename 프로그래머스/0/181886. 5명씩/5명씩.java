import java.util.*;

class Solution {
    public String[] solution(String[] names) {
        List<String> list = new ArrayList<>();
        
        int i=5;
        list.add(names[0]);
        while(i<names.length) {
            list.add(names[i]);
            i += 5;
        }
        return list.stream().toArray(String[]::new);
    }
}