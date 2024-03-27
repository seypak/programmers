import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        for(int i=0; i<strArr.length; i++) {
            String str = strArr[i];
            if(!str.contains("ad")) {
                list.add(str);
            }
        }
        return list.stream().toArray(String[]::new);
    }
}