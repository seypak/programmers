import java.util.*;

class Solution {
    
    public int solution(String binomial) {
        String str = binomial.replace(" ", "");
        String[] arr;
        if(binomial.contains("+")) {
            arr = str.split("\\+");
            return Integer.valueOf(arr[0]) + Integer.valueOf(arr[1]);
        } else if(binomial.contains("-")) {
            arr = str.split("\\-");
            return Integer.valueOf(arr[0]) - Integer.valueOf(arr[1]);
        } else if(binomial.contains("*")) {
            arr = str.split("\\*");
            return Integer.valueOf(arr[0]) * Integer.valueOf(arr[1]);
        }
        return 0;
    }
}