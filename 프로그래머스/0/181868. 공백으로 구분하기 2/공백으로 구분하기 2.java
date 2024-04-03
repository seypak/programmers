import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        String[] splitArr = my_string.split(" ");
        
        return Arrays.stream(splitArr).filter(x -> !x.equals("")).toArray(String[]::new);
    }
}