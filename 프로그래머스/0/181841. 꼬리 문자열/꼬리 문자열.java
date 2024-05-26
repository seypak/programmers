import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String[] str_list, String ex) {
        return Arrays.stream(str_list).filter(x -> !x.contains(ex)).collect(Collectors.joining(""));
    }
}