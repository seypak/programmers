import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<todo_list.length; i++) {
            String todo = todo_list[i];
            if(!finished[i]) {
                list.add(todo);
            }
        }
        return list.stream().toArray(String[]::new);
    }
}